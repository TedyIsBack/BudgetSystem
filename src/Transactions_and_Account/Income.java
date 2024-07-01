package Transactions_and_Account;

import Category.BudgetCategory;

import java.util.ArrayList;
import java.util.List;

public class Income extends  Transaction {

    private List<BudgetCategory> incomeCategories = new ArrayList<>();

    public void addCategory(BudgetCategory income) {
            amount += income.getAmount();
            incomeCategories.add(income);
            budgetCategories.add(income);
            System.out.printf("Sucessfully added income from %s %.2f лв. ", income.getCategory() , income.getAmount());

    }

    public void removeCategory(BudgetCategory income) {
        if (amount > income.getAmount()) {
            amount -= income.getAmount();
            incomeCategories.remove(income);
            budgetCategories.remove(income);

            System.out.println("Successfuly removed income");
        }
    }

  /*  public void print() {
        System.out.println("Print incomes : ");
        for (var i :  incomeCategories) {
            System.out.println(i);
        }
    }*/




}
