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
    public UserAccountDTO createUserAccount(UserAccountDTO userAccountDTO) {
        UserAccount userAccount = userAccountMapper.fromDTO(userAccountDTO);
        return saveAndReturn(userAccount);
    }

    @Override
    public UserAccountDTO readUserAccount(Long id) {
        return userAccountRepository.findById(id)
                .map(userAccountMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("User account with ID " + id + " not found"));    }

    @Override
    public UserAccountDTO editUserAccount(UserAccountDTO userAccountDTO) {
        UserAccount userAccount = userAccountMapper.fromDTO(userAccountDTO);
        ensureUserAccountExists(userAccountDTO.userAccountId());
        return saveAndReturn(userAccount);
    }

    @Override
    public void deleteUserAccount(Long userAccountId) {
        ensureUserAccountExists(userAccountId);
        userAccountRepository.deleteById(userAccountId);
    }


    private UserAccountDTO saveAndReturn(UserAccount userAccount) {
        UserAccount savedUserAccount = userAccountRepository.save(userAccount);
        return userAccountMapper.toDTO(savedUserAccount);
    }
}
