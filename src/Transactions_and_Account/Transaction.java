package Transactions_and_Account;

import Category.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Transaction {

    protected List<BudgetCategory> budgetCategories;
    protected double amount;

    public Transaction() {
        this.amount = 0;
        budgetCategories = new ArrayList<>();
    }

    public double getAmount() {
        return amount;
    }

    public abstract void addCategory(BudgetCategory budgetCategory);

    public abstract void removeCategory(BudgetCategory budgetCategory);

    public  void print() {
        budgetCategories.forEach((b) -> {
            System.out.println(b);
        });
    }


}