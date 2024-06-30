package Transactions;

import Category.BudgetCategory;
import Category.ExpenceCategory;
import Category.IncomeCategory;

import java.util.ArrayList;
import java.util.List;

public class Income extends  Transaction {

    private List<BudgetCategory> incomeCategories = new ArrayList<>();

    public void addCategory(BudgetCategory income) {
        if (amount > income.getAmount()) {
            amount += income.getAmount();
            incomeCategories.add(income);
            System.out.println("Sucessfully added income for  " + income.getCategory());
        }
    }

    public void removeCategory(BudgetCategory income) {
        amount -= income.getAmount();
        incomeCategories.remove(income);
        System.out.println("Successfuly removed income");
    }

    public void print() {
        incomeCategories.forEach((i) -> {
            System.out.println(i);
        });
    }
}
