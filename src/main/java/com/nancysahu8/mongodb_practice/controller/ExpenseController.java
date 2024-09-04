package com.nancysahu8.mongodb_practice.controller;

import com.nancysahu8.mongodb_practice.model.Expense;
import com.nancysahu8.mongodb_practice.repository.ExpenseRepository;
import com.nancysahu8.mongodb_practice.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity<Objects> addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<Objects> updateExpense(@RequestBody Expense expense) {
        expenseService.updateExpense(expense);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses() {
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }

    //public void getExpenseByName() {}

    //public void deleteExpense() {}
}
