package com.recrible.mapper;

import com.recrible.dto.UserAccountDTO;
import com.recrible.entity.UserAccount;
import org.springframework.stereotype.Component;

@Component
public class UserAccountMapper {
    public static UserAccountDTO createUserAccount(UserAccount userAccount) {
        return new UserAccountDTO(
                userAccount.getUserAccountId(),
                userAccount.getAccountName(),
                userAccount.getEmail(),
                userAccount.getAccountName()
        )

    }
}