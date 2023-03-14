package com.example.mssqljpa;

import com.example.mssqljpa.entity.Account.Account;
import com.example.mssqljpa.entity.Account.AccountRepository;
import com.example.mssqljpa.entity.Account.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MsSqlJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MsSqlJpaApplication.class, args);

        AccountRepository accountRepository = context.getBean(AccountRepository.class);

        Account account = new Account();
        account.setName("Adam");
        account.setEmailAddress("test@test.com");

        accountRepository.save(account);
    }

}
