package com.recrible.UserAccount;

public interface UserAccountImplement {

    UserAccountDTO createUserAccount(UserAccountDTO userAccountDTO);
    UserAccountDTO readUserAccount(Long userAccountId);
    UserAccountDTO editUserAccount(UserAccountDTO userAccountDTO);
    void deleteUserAccount(Long userAccountId);
}
