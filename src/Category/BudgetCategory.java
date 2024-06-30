package Category;

import Accounts.Account;

public  abstract class BudgetCategory {
    private Category category;
    private double amount ;
    protected Account forAccount;

    public BudgetCategory(Category categoryName, double amount,Account account) {
        this.category = categoryName;
        this.amount = amount;
        forAccount = account;
    }
    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public void changeCategory(Category category) {
        this.category = category;
    }

    public void changeAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "%s - %.2f лв. going into %10s".formatted(category.name(),amount,forAccount);
    }
}


