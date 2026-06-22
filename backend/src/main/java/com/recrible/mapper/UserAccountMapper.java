package com.recrible.mapper;

import com.recrible.dto.UserAccountDTO;
import com.recrible.entity.UserAccount;
import org.springframework.stereotype.Component;

@Component
public class UserAccountMapper {
    public UserAccountDTO toDTO(UserAccount userAccount) {
        if (userAccount == null) return null;
        return new UserAccountDTO(
                userAccount.getUserAccountId(),
                userAccount.getAccountName(),
                userAccount.getEmail()
        );
    }

    public UserAccount fromDTO(UserAccountDTO userAccountDTO) {
        if (userAccountDTO == null) return null;

        return UserAccount.builder()
                .userAccountId(userAccountDTO.userAccountId())
                .accountName(userAccountDTO.accountName())
                .email(userAccountDTO.email())
                .build();
    }
}