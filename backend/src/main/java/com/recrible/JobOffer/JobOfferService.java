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


}
