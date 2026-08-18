export interface JobOffer {
    jobOfferId: number,
    jobOfferTitle: string,
    jobOfferDescription: string,
    jobOfferRequirements: string,
    jobOfferSalary: number,
    jobOfferState: 'OPEN' | 'CLOSED' | 'PENDING';
    jobOfferDate: string;
}