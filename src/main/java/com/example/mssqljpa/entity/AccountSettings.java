package com.example.mssqljpa.entity;
import com.example.mssqljpa.entity.Account.Account;
import jakarta.persistence.*;

@Entity
@Table(name = "account_settings")
public class AccountSettings {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String settingName;

    @Column(name = "value", nullable = false)
    private String settingValue;

    @ManyToOne
    @JoinColumn(name ="account_id", nullable = false)
    private Account account;

    // getters and setters
}
