package com.example.mssqljpa.entity.Foo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FooRepository extends CrudRepository<Foo, Long> {

    @Query(
            value = "SELECT * FROM account_foo u WHERE u.name = ?1",
            nativeQuery = true
    )
    Optional<Foo> findByName(String foo);
}
