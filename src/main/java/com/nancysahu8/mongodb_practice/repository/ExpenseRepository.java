package com.nancysahu8.mongodb_practice.repository;

import com.nancysahu8.mongodb_practice.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String>{
}
