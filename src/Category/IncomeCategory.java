package Category;

public class IncomeCategory extends BudgetCategory {
    public IncomeCategory(Category categoryName, double amount, Account account) {
        super(categoryName, amount, account);
        forAccount.calcIncome(amount);
    }


    @Override
    public String toString() {
        return "income from " + super.toString() ;
    }
}
