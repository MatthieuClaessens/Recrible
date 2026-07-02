package com.recrible.JobOffer;

import org.springframework.stereotype.Component;

@Component
public class JobOfferMapper {
    public JobOfferDTO toDTO(JobOffer jobOffer) {
        if (jobOffer == null) return null;
        return new JobOfferDTO(
                jobOffer.getJobOfferId(),
                jobOffer.getJobOfferTitle(),
                jobOffer.getJobOfferDescription(),
                jobOffer.getJobOfferRequirements(),
                jobOffer.getJobOfferDate()
        );
    }

    public JobOffer fromDTO(JobOfferDTO jobOfferDTO) {
        if (jobOfferDTO == null) return null;
        return JobOffer.builder()
                .jobOfferId(jobOfferDTO.jobOfferId())
                .jobOfferTitle(jobOfferDTO.jobOfferTitle())
                .jobOfferDescription(jobOfferDTO.jobOfferDescription())
                .jobOfferRequirements(jobOfferDTO.jobOfferRequirements())
                .jobOfferDate(jobOfferDTO.jobOfferDate())
                .build();
    }
}