package com.example.mssqljpa.entity.Account;

import com.example.mssqljpa.entity.AccountSettings;
import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

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

    private String foo;

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

    public List<AccountSettings> getAccountSettings() {
        return accountSettings;
    }

    public void setAccountSettings(List<AccountSettings> accountSettings) {
        this.accountSettings = accountSettings;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
