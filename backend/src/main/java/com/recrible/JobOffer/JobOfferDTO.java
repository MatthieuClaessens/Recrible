package com.recrible.JobOffer;

import jakarta.validation.constraints.NotBlank;

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
