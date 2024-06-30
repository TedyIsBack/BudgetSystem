import Accounts.Account;
import Accounts.SavingAccount;
import Category.BudgetCategory;
import Category.Category;
import Category.ExpenceCategory;
import Category.IncomeCategory;
import Transactions.Expense;
import Transactions.Income;
import Transactions.Transaction;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Peter Frank");
        Account mainAcc = new SavingAccount("Saving Account",30);
        user1.addAccount(mainAcc);
        System.out.println(user1);
        Transaction income = new Income();
        Transaction expence = new Expense();

        income.addCategory(new IncomeCategory(Category.FAMILY,20,mainAcc));

        System.out.println(income);

        /*
        budgetCategory - иконите, които са част от приходите / разходите


         */
    }
}