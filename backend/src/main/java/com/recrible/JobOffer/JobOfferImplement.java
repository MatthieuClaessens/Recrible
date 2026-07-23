package com.recrible.JobOffer;

public interface JobOfferImplement {
    JobOfferDTO createJobOffer (JobOfferDTO jobOfferDTO);
    JobOfferDTO readJobOffer (Long jobOfferId);
    JobOfferDTO editJobOffer (Long jobOfferId, String jobOfferTitle, String jobOfferDescription, String jobOfferRequirements);
    void deleteJobOffer (Long jobOfferId);
}
