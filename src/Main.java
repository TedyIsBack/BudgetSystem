
import Category.*;
import Category.IncomeCategory;
import Transactions_and_Account.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Peter Frank");
        Transaction income = new Income();
        Transaction expence = new Expense();
        Account mainAcc = new SavingAccount("Saving Account",30,income,expence);

        BudgetCategory i = new IncomeCategory(Category.FAMILY,20,mainAcc);


        user.addAccount(mainAcc);
        System.out.println("user : " + user);


        System.out.println();
        System.out.println("\n Adding incomes : ");
        income.addCategory(i);
        income.addCategory(new IncomeCategory(Category.OTHERS,30,mainAcc));

        System.out.println("\n Adding expenses : ");
        expence.addCategory(new ExpenceCategory(Category.FOOD, 40,mainAcc));


        System.out.println("Print incomes ");
        income.print();

        System.out.println("----------------------------------------------");
        System.out.println("user's balance: " + user.getTotalBalance());


        /*
        budgetCategory - иконите, които са част от приходите / разходите


         */
    }
}