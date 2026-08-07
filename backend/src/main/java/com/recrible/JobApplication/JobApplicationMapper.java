package com.recrible.JobApplication;

import org.springframework.stereotype.Component;

@Component
public class JobApplicationMapper {
    public JobApplicationDTO toDTO(JobApplication jobApplication) {
        if (jobApplication == null) return null;
        return new JobApplicationDTO(
                jobApplication.getJobApplicationId(),
                jobApplication.getJobApplicationDate(),
                jobApplication.getJobOffer() != null ? jobApplication.getJobOffer().getJobOfferTitle() : null,
                jobApplication.getJobApplicationState(),
                jobApplication.getJobOffer() != null ? jobApplication.getJobOffer().getJobOfferState() : null,
                jobApplication.getCv() != null ? jobApplication.getCv().getCvName() : null
        );
    }

    public JobApplication fromDTO(JobApplicationDTO jobApplicationDTO) {
        if (jobApplicationDTO == null) return null;

        return JobApplication.builder()
                .jobApplicationId(jobApplicationDTO.jobApplicationId())
                .jobApplicationDate(jobApplicationDTO.jobApplicationDate())
                .build();
    }
}