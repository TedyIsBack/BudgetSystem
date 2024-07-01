package Category;

public class ExpenceCategory extends BudgetCategory {

    public ExpenceCategory(Category categoryName, double amount, Account account) {
        super(categoryName, amount, account);
        forAccount.calcExpence(amount);
    }

    @Override
    public String toString() {
        return "expense for " + super.toString() ;
    }
}
