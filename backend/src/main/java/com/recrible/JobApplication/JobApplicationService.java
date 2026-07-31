package com.recrible.JobApplication;


import com.recrible.JobOffer.*;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.recrible.JobOffer.JobOfferStateEnum.CLOSED;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class JobApplicationService implements JobApplicationImplement {
    private final JobApplicationMapper jobApplicationMapper;
    private final JobApplicationRepository jobApplicationRepository;
    private final JobOfferRepository jobOfferRepository;

    private JobApplication ensureJobApplicationExists(Long jobApplicationId) {
        return jobApplicationRepository.findById(jobApplicationId)
                .orElseThrow(() -> new EntityNotFoundException("jobApplication.notfound;" + jobApplicationId));
    }

    private JobApplicationDTO saveAndReturn(JobApplication jobApplication) {
        return jobApplicationMapper.toDTO(jobApplicationRepository.save(jobApplication));
    }
    
    @Override
    @Transactional
    public JobApplicationDTO createJobApplication(JobApplicationDTO jobApplicationDTO, Long jobOfferId) {
        JobOffer jobOffer = jobOfferRepository.findById(jobOfferId)
                .orElseThrow(() -> new EntityNotFoundException("jobApplication.jobOffer.notfound;" + jobOfferId));
        if (jobOffer.getJobOfferState().equals(CLOSED)) {
            throw new IllegalStateException("Job application state is not active");
        }

            JobApplication jobApplication = jobApplicationMapper.fromDTO(jobApplicationDTO);
            jobApplication.setJobOffer(jobOffer);

            return saveAndReturn(jobApplication);
        }

    @Override
    public JobApplicationDTO readJobApplication(Long jobApplicationId) {
        return jobApplicationMapper.toDTO(ensureJobApplicationExists(jobApplicationId));
    }

    @Override
    @Transactional
    public void deleteJobApplication(Long jobApplicationId) {
        ensureJobApplicationExists(jobApplicationId);
        jobApplicationRepository.deleteById(jobApplicationId);
    }
}
