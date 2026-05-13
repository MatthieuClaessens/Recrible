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
@Table(name = "cv")
public class CV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cv_id")
    private Long CVId;

    @Column(name = "cv_name", nullable = false)
    private String CVName;

    @Column(name = "cv_path", nullable = false)
    private String CVPath;

    @Column(name = "cv_date", nullable = false)
    private LocalDate CVDate;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "user_account_id", nullable = false)
    private UserAccount userAccount;
}
