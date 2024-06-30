package Transactions;

import Category.*;

public abstract class Transaction {
    private String descripiton;
    private BudgetCategory budgetCategory;
    // private  account;
    private double amount;

    public Transaction(String descripiton, BudgetCategory budgetCategory, double amount) {
        this.descripiton = descripiton;
        this.budgetCategory = budgetCategory;
        //this.account = account;
        this.amount = amount;
        //budgetCategory.setAmount(amount);
    }

    public  void deposit(double money){
        if(money <= 0){
            System.out.println("Unable to add negative amount");
        }
        else {
            amount += money;
            //  budgetCategory.setAmount(money);
        }
    }

    public void withdraw(double money){
        if(amount <= 0){
            System.out.println("Doesn't have enough money : " + amount);
        }
        else {
            amount -= money;
        }
    }

    public Category getBudgetCategory() {
        return budgetCategory.getCategory();
    }
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction ";
    }
}
