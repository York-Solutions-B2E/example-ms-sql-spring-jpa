package com.example.mssqljpa.entity.Foo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account_foo")
public class Foo {

    @Id
    @GeneratedValue
    Long id;


    public String name;

}
