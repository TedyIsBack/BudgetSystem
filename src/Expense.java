public class Expense {
    private String descripiton;
    private BudgetCategory budgetCategory;
    private Account account;
    private double amount;

    public Expense(String descripiton, BudgetCategory budgetCategory, Account account, double amount) {
        this.descripiton = descripiton;
        this.budgetCategory = budgetCategory;
        this.account = account;
        this.amount = amount;
    }

    public  void deposit(double money){
        if(money <= 0){
            System.out.println("Unable to add negative amount");
        }
        else {
            amount += money;
        }
    }

    public void withdraw(double money){
        if(amount <= 0){
            System.out.println("Doesn't have enough money : " + amount);
        }
        else {
            amount -= money;

        }
    }

    public Category getBudgetCategory() {
        return budgetCategory.getCategory();
    }
    public double getAmount() {
        return amount;
    }
}
