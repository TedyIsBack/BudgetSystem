package Transactions;
public class IncomeTransaction extends Transaction {

    private double amount;
    private IncomeCategory category;

    public IncomeTransaction(double amount,IncomeCategory incomeCategory) {
        super(amount);
        category = incomeCategory;
    }

    @Override
    public String toString() {
        return "Income from  " + category + " : " + amount;
    }
}

