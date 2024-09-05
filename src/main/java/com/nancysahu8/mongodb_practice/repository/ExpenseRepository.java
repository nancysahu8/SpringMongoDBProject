package com.nancysahu8.mongodb_practice.repository;

import com.nancysahu8.mongodb_practice.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense, String>{

    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
}
