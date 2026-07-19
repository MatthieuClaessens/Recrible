package com.recrible.UserAccount;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserAccountService implements UserAccountImplement {
    private final UserAccountMapper userAccountMapper;
    private final UserAccountRepository userAccountRepository;

    private void ensureUserAccountExists(Long userAccountId) {
        if (!userAccountRepository.existsById(userAccountId)) {
            throw new EntityNotFoundException("User account with ID" + userAccountId + " not found");
        }
    }

    @Override
    public UserAccountDTO createUserAccount(UserAccountDTO dto) {
        if (userAccountRepository.existsByEmail(dto.email())) {
            throw new IllegalArgumentException("Email already taken!");
        }
        return saveAndReturn(userAccountMapper.fromDTO(dto));
    }

    @Override
    @Transactional(readOnly = true)
    public UserAccountDTO readUserAccount(Long id) {
        return userAccountRepository.findById(id)
                .map(userAccountMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("User account with ID " + id + " not found"));    }

    @Override
    public UserAccountDTO editUserAccount(UserAccountDTO userAccountDTO) {
        ensureUserAccountExists(userAccountDTO.userAccountId());
        return saveAndReturn(userAccountMapper.fromDTO(userAccountDTO));
    }

    @Override
    public void deleteUserAccount(Long userAccountId) {
        ensureUserAccountExists(userAccountId);
        userAccountRepository.deleteById(userAccountId);
    }


    private UserAccountDTO saveAndReturn(UserAccount userAccount) {
        return userAccountMapper.toDTO(userAccountRepository.save(userAccount));
    }
}
