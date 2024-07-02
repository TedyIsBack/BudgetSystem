package Transactions;


public class ExpenseTransaction  {

private ExpenceCategory category;
private int id ;
private double amount;
    public ExpenseTransaction(int id,double amount,ExpenceCategory expenceCategory) {
        this.id = id;
        this.amount = amount;
        category = expenceCategory;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Expence No. " + id +" for  " + category + " : " + amount;
    }
}

