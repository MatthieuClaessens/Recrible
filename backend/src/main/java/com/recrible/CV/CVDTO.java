package com.recrible.CV;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CVDTO(
        @NotNull(message = "{cv.cvId.notnull}")
        Long cvId,
        @NotBlank(message = "{cv.cvName.notblank}")
        String cvName,
        LocalDate cvDate) {}
