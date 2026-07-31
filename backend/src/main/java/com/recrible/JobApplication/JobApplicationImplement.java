package com.recrible.JobApplication;

public interface JobApplicationImplement {
    JobApplicationDTO createJobApplication(JobApplicationDTO jobApplicationDTO, Long jobOfferId);
    JobApplicationDTO readJobApplication(Long jobApplicationId);
    void deleteJobApplication(Long jobApplicationId);
}
