package Category;

import Transactions.Expense;

import java.util.ArrayList;
import java.util.List;

public  abstract class BudgetCategory {
    private Category name;
    private double amount ;
    private List<Expense> expenseList;

    public BudgetCategory(Category name) {
        this.name = name;
        amount = 0;
        expenseList = new ArrayList<>();
    }

    public Category getCategory() {
        return name;
    }

   public void addExpence (Expense expense){
        expenseList.add(expense);
   }
   public void removeExpence(Expense expense){
        expenseList.remove(expense);
   }

    public double getAmount() {
        return amount;
    }
}


