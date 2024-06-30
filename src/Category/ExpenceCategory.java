package Category;

import Accounts.Account;
import Category.Category;

public class ExpenceCategory extends BudgetCategory {

    public ExpenceCategory(Category categoryName, double amount, Account account) {
        super(categoryName, amount, account);
    }

    @Override
    public String toString() {
        return "expense for " + super.toString() ;
    }
}
