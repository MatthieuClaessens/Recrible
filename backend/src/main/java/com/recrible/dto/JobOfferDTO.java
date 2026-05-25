package com.recrible.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record JobOfferDTO (
        Long jobOfferId,

        @NotBlank(message = "{jobOffer.title.notblank}")
        String jobOfferTitle,

        @NotBlank(message = "{jobOffer.description.notblank}")
        String jobOfferDescription,
        String jobOfferRequirements,
        LocalDate jobOfferDate) {
}
