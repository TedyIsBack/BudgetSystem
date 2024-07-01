package Category;

import Transactions_and_Account.*;

public abstract class Account {
    private String name;
    private Transaction incomePart;
    private Transaction expencePart;


    private double balance;

    public Account(String name, double balance,Transaction income, Transaction expence) {
        this.name = name;
        this.balance = balance;
        incomePart = income;
        expencePart = expence;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    protected void calcExpence(double amount) {
        if(amount <= balance){
            balance -= amount;
        }
    }

    protected void calcIncome(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void printTransactions(){
        System.out.println("Transactions for account " +  name);
        System.out.println(incomePart);
        System.out.println(expencePart);
    }


    @Override
    public String toString() {
        return "%s (current balance : %.2f лв.)".formatted(name,balance);
    }


}
