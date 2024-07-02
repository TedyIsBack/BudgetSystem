package Account;

import Transactions.IncomeTransaction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Profit extends  Finances {

    private List<IncomeTransaction> incomes;
    private double amount;

    public Profit() {
        incomes = new ArrayList<>();
        amount = 0;
    }

    protected void addTransaction(IncomeTransaction transaction) {
        incomes.add(transaction);
        amount += transaction.getAmount();

    }

    protected boolean removeTransaction(IncomeTransaction income) {

        IncomeTransaction incomeToRemove = foundIncome(income.getId());
        if (incomeToRemove != null) {
            if (incomeToRemove.getAmount() == income.getAmount()) {
                incomes.remove(incomeToRemove);
                System.out.println("REMOVED FROM PROFIT CLASS ");
                amount -= incomeToRemove.getAmount();
            } else {
                double change = Math.abs(incomeToRemove.getAmount() - income.getAmount());
                incomeToRemove.setAmount(change);
                amount -= change;
            }
            return  true;
        }
        return false;
    }

    private IncomeTransaction foundIncome(int id) {
        for (IncomeTransaction currentTransaction : incomes) {
            if (currentTransaction.getId() == id) {
                return currentTransaction;
            }
        }
        return null;
    }

    protected void printTransactions() {
        incomes.forEach((i) -> {
            System.out.println("  | " + i);
        });
    }

    public double getAmount() {
        return amount;
    }
}
