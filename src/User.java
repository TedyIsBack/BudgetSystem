import Category.Account;

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

    public double getTotalBalance() {
        return TotalBalance;
    }

    public void PrintAccounts(){
        System.out.println("Category_and_Account.Account list for user " + name);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Override
    public String toString() {
        return "%s has %d accounts in this system with total balance %.2f".formatted(name,accounts.size(),TotalBalance);
    }
}
