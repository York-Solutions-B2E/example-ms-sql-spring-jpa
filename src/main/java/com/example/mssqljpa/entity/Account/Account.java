package com.example.mssqljpa.entity.Account;

import com.example.mssqljpa.entity.AccountSettings;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "email_address")
    private String emailAddress;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<AccountSettings> accountSettings = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<AccountSettings> getAccountSettings() {
        return accountSettings;
    }

    public void setAccountSettings(List<AccountSettings> accountSettings) {
        this.accountSettings = accountSettings;
    }
}
