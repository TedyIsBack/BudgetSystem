package Transactions_and_Account;

import Category.*;

import java.util.ArrayList;
import java.util.List;

public class Expense extends Transaction{
    private List<BudgetCategory> expenceCategories = new ArrayList<>();

    public  void addCategory(BudgetCategory expence){
        if(amount >= expence.getAmount()){
            amount -= expence.getAmount();
            expenceCategories.add(expence);
            budgetCategories.add(expence);
            System.out.println("Sucessfully added expesne for  " + expence.getCategory());
        }
    }

    public void removeCategory (BudgetCategory expence){
      amount += expence.getAmount();
        expenceCategories.remove(expence);
        budgetCategories.remove(expence);
        System.out.println("Successfuly removed expence");
    }

    /*public void print() {
        System.out.println("Print incomes : ");
        for (var e :  expenceCategories) {
            System.out.println(e);
        }
    }*/



}
