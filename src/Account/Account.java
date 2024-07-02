package Account;

import Transactions.ExpenseTransaction;
import Transactions.IncomeTransaction;

public  class Account {
   private String name;
   protected double balance;
   private Profit profitPart;
   private Expence expencePart;


   public Account(String name,double balance) {
      this.name = name;
      this.balance = balance;
      expencePart = new Expence();
      profitPart = new Profit();
   }

   public Account(String name) {
      this(name,0);
      expencePart = new Expence();
      profitPart = new Profit();
   }

   public void addToProfit(IncomeTransaction income){
      profitPart.addTransaction(income);
      balance += income.getAmount();

   }

   public void removeFromProfit(IncomeTransaction income){
      if(profitPart.removeTransaction(income)) {
         balance -= income.getAmount();
      }
   }

   public void addToExpence(ExpenseTransaction expense){
      expencePart.addTransaction(expense);
      balance -= expense.getAmount();
   }
   public void removeFromExpence(ExpenseTransaction expense){
      double value = expencePart.removeTransaction(expense);
      if(value >= 0) {
         balance += value;
      }
   }

   public void printAllTransactions(){
      System.out.println(" >> All transactions for " + name);
      profitPart.printTransactions();
      expencePart.printTransactions();
   }

   public double getBalance() {
      return balance;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return "%s : %.2f".formatted(name,balance);
   }
}
