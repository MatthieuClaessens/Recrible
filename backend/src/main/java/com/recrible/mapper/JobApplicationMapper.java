package com.recrible.mapper;

import com.recrible.dto.JobApplicationDTO;
import com.recrible.entity.JobApplication;
import org.springframework.stereotype.Component;

@Component
public class JobApplicationMapper {
    public JobApplicationDTO toDTO(JobApplication jobApplication) {
        if (jobApplication == null) return null;
        return new JobApplicationDTO(
                jobApplication.getJobApplicationId(),
                jobApplication.getJobApplicationDate(),
                jobApplication.getJobOffer().getJobOfferTitle(),
                jobApplication.getCv().getCvName()
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