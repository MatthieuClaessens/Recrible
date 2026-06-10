package com.recrible.dto;
import java.time.LocalDate;

public record JobApplicationDTO(Long jobApplicationId,
                                LocalDate jobApplicationDate,
                                String jobOfferTitle,
                                String cvName) {}
