package Transactions;

import Accounts.Account;
import Category.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Transaction {
    protected double amount;

    public Transaction() {
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public  abstract void addCategory(BudgetCategory budgetCategory);
    public  abstract void removeCategory(BudgetCategory budgetCategory);
    public abstract void print();
}
