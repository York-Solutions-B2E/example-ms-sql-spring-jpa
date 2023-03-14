package com.example.mssqljpa.entity.Account;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Optional<Account> getAccount(Long id) {
        return this.accountRepository.findById(id);
    }

}
