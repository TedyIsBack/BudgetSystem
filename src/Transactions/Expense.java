package Transactions;

import Category.*;

public class Expense extends Transaction{


    public Expense(String descripiton, BudgetCategory budgetCategory, double amount) {
        super(descripiton, budgetCategory, amount);
    }

}
