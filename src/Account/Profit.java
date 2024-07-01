package Account;

import Transactions.IncomeTransaction;
import Transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Profit extends  Finances{

    private List<Transaction> incomes;
    private double amount;

    public Profit() {
        this.incomes = new ArrayList<>();
        amount = 0;
    }

    protected void addTransaction(IncomeTransaction transaction){
        incomes.add(transaction);
        amount += transaction.getAmount();

    }


    protected void removeTransaction(IncomeTransaction transaction){
        incomes.remove(transaction);
        amount -= transaction.getAmount();
    }

    public double getAmount() {
        return amount;
    }


}
