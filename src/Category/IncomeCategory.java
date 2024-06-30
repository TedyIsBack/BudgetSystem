package Category;

import Accounts.Account;
import Category.*;

public class IncomeCategory extends BudgetCategory {
    public IncomeCategory(Category categoryName, double amount, Account account) {
        super(categoryName, amount, account);
    }

  /*  private void addToAccount(){
        forAccount.addIncome(getAmount());
    }*/

    public String toString() {
        return "income from " + super.toString() ;
    }
}
