package com.recrible.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserAccountDTO (
        Long userAccountId,

        @NotBlank(message = "{userAccount.name.notblank}")
        @Size(min = 4, max = 30, message = "{userAccount.name.size}")
        String accountName,

        @NotBlank(message = "{userAccount.email.notblank}")
        @Email(message = "{userAccount.email.invalid}")
        String email) {
}
