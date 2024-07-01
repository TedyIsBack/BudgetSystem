import Account.*;
import Transactions.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Peter Draker");
         Account account = new Account("Saving Account",300);
         user.addAccount(account);

        System.out.println(user);

        account.addToProfit(new IncomeTransaction(30,IncomeCategory.BANK));
        System.out.println("user balance " + user.getTotalBalance());
        account.removeFromProfit(new IncomeTransaction(30,IncomeCategory.BANK));
        account.addToExpence(new ExpenseTransaction(30,ExpenceCategory.FOOD));
        account.removeFromExpence(new ExpenseTransaction(20,ExpenceCategory.FOOD));

        System.out.println("account balance " + account.getBalance());
        user.PrintAccounts();
    }
}