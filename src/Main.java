import Accounts.Account;
import Accounts.SavingAccount;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Peter Frank");
        Account savingAcc = new SavingAccount("Saving Accounts.Account",30);
        user1.addAccount(savingAcc);
      //  savingAcc.addExpence(new Transactions.Expense("",new Category.BudgetCategory(Category.Category.FOOD),300));
        System.out.println(user1);


    }
}