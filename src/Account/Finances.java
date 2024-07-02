package Account;

public abstract class Finances {

    private double amount;

    public Finances() {
        amount = 0;
    }

    protected abstract void printTransactions();

    public double getAmount() {
        return amount;
    }
}
