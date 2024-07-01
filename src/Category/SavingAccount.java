package Category;

import Transactions_and_Account.Transaction;

public class SavingAccount extends Account {


    public SavingAccount(String name, double balance, Transaction income, Transaction expence) {
        super(name, balance, income, expence);
    }
}
