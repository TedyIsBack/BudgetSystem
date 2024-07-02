package Transactions;
public class IncomeTransaction  {

    private IncomeCategory category;
    private double amount;
    private  int id ;

    public IncomeTransaction(int id,double amount,IncomeCategory incomeCategory) {
        this.id = id;
        this.amount = amount;
        category = incomeCategory;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Income No. " + id +" from  " + category + " : " + amount;
    }

    public void setAmount(double change) {
        amount = change;
    }
}

