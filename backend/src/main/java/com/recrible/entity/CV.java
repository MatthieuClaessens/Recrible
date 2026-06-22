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
@Table(name = "cv")
public class CV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cv_id")
    private Long cvId;

    @Column(name = "cv_name", nullable = false)
    private String cvName;

    @Column(name = "cv_path", nullable = false)
    private String cvPath;

    @Column(name = "cv_date", nullable = false)
    private LocalDate cvDate;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "useraccount_id", nullable = false)
    private UserAccount userAccount;
}
