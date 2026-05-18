package com.recrible.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_application")
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_application_id")
    private Long jobApplicationId;

    @Column(name = "job_application_date", nullable = false)
    private LocalDate jobApplicationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_offer_id", nullable = false)
    private JobOffer jobOffer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cv_id")
    private CV cv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "useraccount_id")
    private UserAccount userAccount;
}
