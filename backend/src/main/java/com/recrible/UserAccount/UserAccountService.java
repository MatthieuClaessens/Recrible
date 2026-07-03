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

    @Override
    public UserAccountDTO createUserAccount(UserAccountDTO userAccountDTO) {
        UserAccount userAccount = userAccountMapper.fromDTO(userAccountDTO);
        UserAccount savedUserAccount = userAccountRepository.save(userAccount);
        return userAccountMapper.toDTO(savedUserAccount);
    }

    @Override
    public void deleteUserAccount(Long userAccountId) {
        if (!userAccountRepository.existsById(userAccountId)) {
            throw new EntityNotFoundException("User account with ID" + userAccountId + " not found");
        }
        userAccountRepository.deleteById(userAccountId);
    }
}
