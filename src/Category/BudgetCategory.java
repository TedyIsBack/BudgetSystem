package Category;

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

    public Account getForAccount() {
        return forAccount;
    }

    public void changeCategory(Category category) {
        this.category = category;
    }

    public void changeAmount(double amount) {
        this.amount = amount;
    }
    public String toString() {
        return "%s - %.2f лв. going into %s".formatted(category,getAmount(),forAccount);
    }

}


