package Account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    private String name;
    private List<Account> accounts;
    private double TotalBalance;

    public User(String name) {
        this.name = name;
        accounts = new ArrayList<>();
        TotalBalance = 0;
    }

    public void addAccount(Account account){
        if(!accounts.contains(account) && account != null){
            accounts.add(account);
            TotalBalance += account.getBalance();
        }
    }
    public void removeAccount(String name){
        Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            if (account.getName().equals(name)) {
             TotalBalance -= account.getBalance();
              iterator.remove();
            }
        }
    }
/*

    public void addTransaction(Account account, IncomeTransaction transaction){
        if(accounts.contains(account) && transaction.getAmount() > 0){
            account.addToProfit(transaction);
            System.out.println("Успешно направена транзакция " + transaction +" в сметка  " + account.getName() );
        }
    }
*/

    protected void setTotalBalance(double totalBalance) {
        TotalBalance = totalBalance;
    }

    public double getTotalBalance() {

        TotalBalance = 0;
        for (var account : accounts) {
            TotalBalance += account.getBalance();
        }
        return TotalBalance;
    }

    public void PrintAccounts(){
        System.out.println("---------------------\n| Account list for user " + name + " : ");
        for (Account account : accounts) {
            System.out.println("| " + account);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return ("---------------------\n" +
                "%s has %d accounts in this system with total balance %.2f\n").formatted(name,accounts.size(),TotalBalance);
    }
}
