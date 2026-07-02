package com.recrible.JobApplication;

import com.recrible.CV.CV;
import com.recrible.JobOffer.JobOffer;
import com.recrible.UserAccount.UserAccount;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
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
