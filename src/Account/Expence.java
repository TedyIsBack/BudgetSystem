package Account;

import Transactions.ExpenseTransaction;
import Transactions.IncomeTransaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Expence extends  Finances{

    private List<ExpenseTransaction> expences;
    private double amount;

    public Expence() {
        this.expences = new ArrayList<>();
        amount = 0;
    }

    protected void addTransaction(ExpenseTransaction transaction){
        expences.add(transaction);
        amount += transaction.getAmount();

    }
    protected double removeTransaction(ExpenseTransaction expence) {

        ExpenseTransaction expenceToRemove = foundIncome(expence.getId());
        if (expenceToRemove != null) {
            if (expenceToRemove.getAmount() == expence.getAmount()) {
                expences.remove(expenceToRemove);
                System.out.println("REMOVED FROM EXPENCE CLASS ");
                return amount -= expenceToRemove.getAmount();
            } else {
                double diff =expenceToRemove.getAmount() - expence.getAmount();
                amount -= diff;
                expenceToRemove.setAmount(expence.getAmount());
                return diff;
            }
        }
        return -1;
    }

    private ExpenseTransaction foundIncome(int id) {
        for (ExpenseTransaction currentTransaction : expences) {
            if (currentTransaction.getId() == id) {
                return currentTransaction;
            }
        }
        return null;
    }




    protected void printTransactions(){
        expences.forEach((e) -> {
            System.out.println("  | " + e);
        });
    }
    public double getAmount() {
        return amount;
    }
}
