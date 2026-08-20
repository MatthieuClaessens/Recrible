package com.recrible.Entreprise;

import com.recrible.JobOffer.JobOffer;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "entreprise")

public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entreprise_id")
    private Long entrepriseId;

    @Column(name = "entreprise_name", nullable = false, unique = true, length = 50)
    private String entrepriseName;

    @Column(name = "entreprise_description", length = 250)
    private String entrepriseDescription;

    @Column(name = "entreprise_website", length = 100)
    private String entrepriseWebsite;

    @OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<JobOffer> jobOffers = new ArrayList<>();
}