package com.recrible.entity;

import jakarta.persistence.*;
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

    @Column(nullable = false)
    private LocalDate jobOfferDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "useraccount_id", nullable = false)
    private UserAccount userAccount;
}