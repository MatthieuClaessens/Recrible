package com.recrible.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
}
