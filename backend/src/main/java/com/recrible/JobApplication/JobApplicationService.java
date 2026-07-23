package com.recrible.JobApplication;


import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class JobApplicationService implements JobApplicationImplement {
    private final JobApplicationMapper jobaApplicationMapper;

    private final JobApplicationRepository jobApplicationRepository;

    private JobApplication ensureJobApplicationExists(Long jobApplicationId) {
        return jobApplicationRepository.findById(jobApplicationId)
                .orElseThrow(() -> new EntityNotFoundException("Job application with ID " + jobApplicationId + " not found"));
    }

    private JobApplicationDTO saveAndReturn(JobApplication jobApplication) {
        return jobaApplicationMapper.toDTO(jobApplicationRepository.save(jobApplication));
    }

    @Override
    public JobApplicationDTO createJobApplication(JobApplicationDTO jobApplicationDTO) {
        return saveAndReturn(jobaApplicationMapper.fromDTO(jobApplicationDTO));
    }

    @Override
    public JobApplicationDTO readJobApplication(Long jobApplicationId) {
        return jobaApplicationMapper.toDTO(ensureJobApplicationExists(jobApplicationId));
    }

    @Override
    public void deleteJobApplication(Long jobApplicationId) {
        ensureJobApplicationExists(jobApplicationId);
        jobApplicationRepository.deleteById(jobApplicationId);
    }
}
