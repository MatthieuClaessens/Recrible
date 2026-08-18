package com.recrible.JobOffer;

import com.recrible.Entreprise.Entreprise;
import com.recrible.UserAccount.UserAccount;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "job_offer")
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobOfferId;

    @Column(nullable = false, length = 50)
    private String jobOfferTitle;

    @Column(nullable = false, length = 4000)
    private String jobOfferDescription;

    @Column(length = 200)
    private String jobOfferRequirements;

    @Column
    @Max(999999)
    private Integer jobOfferSalary;

    @Column(nullable = false)
    private LocalDate jobOfferDate;

    @Builder.Default
    @Column(name = "job_offer_state", nullable = false)
    String jobOfferState = "PENDING";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "useraccount_id", nullable = false)
    private UserAccount userAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entreprise_id", nullable = false)
    private Entreprise entreprise;
}