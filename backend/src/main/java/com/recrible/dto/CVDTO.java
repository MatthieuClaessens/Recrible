package com.recrible.dto;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record CVDTO(
        Long cvId,
        @NotBlank(message = "{cv.cvName.notblank}")
        String cvName,
        LocalDate cvDate) {}
