package com.recrible.dto;

import java.time.LocalDate;

public record JobOfferDTO (Long jobOfferId, String jobOfferTitle, String jobOfferDescription, String jobOfferRequirements, LocalDate jobOfferDate) {
}
