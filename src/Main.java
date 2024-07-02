import Account.*;
import Transactions.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Peter Draker");
         Account account = new Account("Saving Account",300);
         user.addAccount(account);
        user.PrintAccounts();

        System.out.println(user);

       // account.addToProfit(new IncomeTransaction(4,30,IncomeCategory.BANK));
       // account.removeFromProfit(new IncomeTransaction(4,20,IncomeCategory.BANK));
        account.addToExpence(new ExpenseTransaction(1,30,ExpenceCategory.FOOD));
        account.removeFromExpence(new ExpenseTransaction(1,40,ExpenceCategory.FOOD));

        System.out.println("user balance " + user.getTotalBalance());
        System.out.println("account balance " + account.getBalance());
        System.out.println();
        account.printAllTransactions();
    }
}