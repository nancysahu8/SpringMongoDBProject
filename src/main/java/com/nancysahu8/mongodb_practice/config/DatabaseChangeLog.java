package com.nancysahu8.mongodb_practice.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.nancysahu8.mongodb_practice.model.Expense;
import com.nancysahu8.mongodb_practice.model.ExpenseCategory;
import com.nancysahu8.mongodb_practice.repository.ExpenseRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class DatabaseChangeLog {

    @ChangeSet(order="001", id="seedDatabase", author = "Nancy")
    public void seedDatabase(ExpenseRepository expenseRepository){
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(createNewExpense("MovieTickets", ExpenseCategory.ENTERTAIMENT, BigDecimal.valueOf(180)));
        expenseList.add(createNewExpense("Dinner", ExpenseCategory.RESTAURANT, BigDecimal.valueOf(320)));
        expenseList.add(createNewExpense("ConcertTickets", ExpenseCategory.ENTERTAIMENT, BigDecimal.valueOf(800)));
        expenseList.add(createNewExpense("CafeDate", ExpenseCategory.RESTAURANT, BigDecimal.valueOf(220)));
        expenseList.add(createNewExpense("Flight to Bali", ExpenseCategory.ENTERTAIMENT, BigDecimal.valueOf(300)));

        expenseRepository.insert(expenseList);
    }

    private Expense createNewExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount){
        Expense expense = new Expense();
        expense.setExpenseName(expenseName);
        expense.setExpenseCategory(expenseCategory);
        expense.setExpenseAmount(expenseAmount);
        return expense;
    }
}
