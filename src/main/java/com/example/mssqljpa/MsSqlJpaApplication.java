package com.example.mssqljpa;

import com.example.mssqljpa.entity.Account.Account;
import com.example.mssqljpa.entity.Account.AccountRepository;
import com.example.mssqljpa.entity.Account.AccountService;
import com.example.mssqljpa.entity.Foo.Foo;
import com.example.mssqljpa.entity.Foo.FooRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MsSqlJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MsSqlJpaApplication.class, args);

        FooRepository fooRepository = context.getBean(FooRepository.class);

        Foo foo = new Foo();
        foo.name = "Brett";
        fooRepository.save(foo);


        System.out.println(
                fooRepository.findByName("Brett")
        );
    }

}
