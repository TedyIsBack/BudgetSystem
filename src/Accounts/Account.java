package Accounts;

import Category.Category;
import Transactions.Expense;
import Transactions.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String name;
    private List<Transaction> transactionList;

    private double balance;

    public Account(String name,double balance) {
        this.name = name;
        this.balance = balance;
        transactionList = new ArrayList<>();
    }

    public void addExpence(Expense expense){

        balance += expense.getAmount();
        Category category = null;
        for (Transaction t : transactionList){
            if(t.getBudgetCategory().equals(expense.getBudgetCategory())){
                category = expense.getBudgetCategory();
                break;
            }
        }
        if(!transactionList.contains(expense)){
            System.out.println("Successfuly added a new expence");
            transactionList.add(expense);
        }
        else if( category != null) {
            int index = transactionList.indexOf(expense);
            transactionList.get(index).deposit(expense.getAmount());
            System.out.println("Successfuly added to the expence " + expense.getBudgetCategory());

        }
    }

    public void removeExpence(Expense expense){
        if(transactionList.contains(expense)){
            transactionList.remove(expense);
            System.out.println("Successfuly removed");
        }
        else {
            System.out.println("Can't find and remove the expence");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }


    public void printExpences(){
        System.out.println("Expences for account " +  name);
        for (Transaction t : transactionList) {
            System.out.println(t);
        }
    }
    @Override
    public String toString() {
        return "Accounts.Account %s-15 %f".formatted(name,balance);
    }
}
