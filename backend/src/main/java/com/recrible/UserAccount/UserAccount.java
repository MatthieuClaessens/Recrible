package com.recrible.UserAccount;

import com.recrible.CV.CV;
import com.recrible.JobOffer.JobOffer;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "user_account")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "useraccount_id")
    private Long userAccountId;

    @Column(name = "account_name", nullable = false, unique = true, length = 15)
    private String accountName;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "phone_number", length = 20, unique = true)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 20)
    private Role role;

    @OneToMany(mappedBy = "userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CV> cvs;

    @OneToMany(mappedBy = "userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JobOffer> joboffers;

}