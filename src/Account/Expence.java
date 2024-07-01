package Account;

import Transactions.ExpenseTransaction;
import Transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Expence extends  Finances{

    private List<Transaction> expences;
    private double amount;

    public Expence() {
        this.expences = new ArrayList<>();
        amount = 0;
    }

    protected void addTransaction(ExpenseTransaction transaction){
        expences.add(transaction);
        amount -= transaction.getAmount();

    }


    protected void removeTransaction(ExpenseTransaction transaction){
        expences.remove(transaction);
        amount += transaction.getAmount();
    }

    public double getAmount() {
        return amount;
    }
}
