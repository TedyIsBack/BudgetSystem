package Transactions;

import java.util.Date;

public  class Transaction {

    protected double amount;


    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


}
