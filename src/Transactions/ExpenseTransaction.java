package Transactions;


public class ExpenseTransaction  extends  Transaction{

private ExpenceCategory category;
    public ExpenseTransaction(double amount,ExpenceCategory expenceCategory) {
        super(amount);
        category = expenceCategory;
    }

    @Override
    public String toString() {
        return "Expence for " + category + " : " + amount;
    }
}

