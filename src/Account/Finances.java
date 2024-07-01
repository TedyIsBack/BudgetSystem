package Account;

import Transactions.Transaction;

import java.util.ArrayList;

public abstract class Finances {

    private double amount;

    public Finances() {
        amount = 0;
    }

   // protected abstract void addTransaction(Transaction transaction);


   // protected abstract void removeTransaction(Transaction transaction);

    public double getAmount() {
        return amount;
    }
}
