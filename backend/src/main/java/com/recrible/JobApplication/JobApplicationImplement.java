package com.recrible.JobApplication;

public interface JobApplicationImplement {
    JobApplicationDTO createJobApplication(JobApplicationDTO jobApplicationDTO);
    JobApplicationDTO readJobApplication(Long jobApplicationId);
    void deleteJobApplication(Long jobApplicationId);
}
