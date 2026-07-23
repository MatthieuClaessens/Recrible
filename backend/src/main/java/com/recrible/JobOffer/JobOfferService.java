package com.recrible.JobOffer;


import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class JobOfferService implements JobOfferImplement {

    private final JobOfferMapper jobOfferMapper;
    private final JobOfferRepository jobOfferRepository;

    private JobOffer ensureJobOfferExists(Long jobOfferId) {
            return jobOfferRepository.findById(jobOfferId)
                    .orElseThrow(() -> new EntityNotFoundException("Job offer with ID " + jobOfferId + " not found"));
        }

        private JobOfferDTO saveAndReturn(JobOffer jobOffer) {
            return jobOfferMapper.toDTO(jobOfferRepository.save(jobOffer));
        }

        @Override
        public JobOfferDTO createJobOffer(JobOfferDTO jobOfferDTO) {
            return saveAndReturn(jobOfferMapper.fromDTO(jobOfferDTO));
        }

        @Override
        public JobOfferDTO readJobOffer(Long jobOfferId) {
            return jobOfferMapper.toDTO(ensureJobOfferExists(jobOfferId));
        }

        @Override
        public JobOfferDTO editJobOffer(Long jobOfferId, String jobOfferTitle, String jobOfferDescription, String jobOfferRequirements) {
            JobOffer jobOffer = ensureJobOfferExists(jobOfferId);
            jobOffer.setJobOfferTitle(jobOfferTitle);
            jobOffer.setJobOfferDescription(jobOfferDescription);
            jobOffer.setJobOfferRequirements(jobOfferRequirements);
            return saveAndReturn(jobOffer);
        }

        @Override
        public void deleteJobOffer(Long jobOfferId) {
        ensureJobOfferExists(jobOfferId);
        jobOfferRepository.deleteById(jobOfferId);
        }
}
