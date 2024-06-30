import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String name;
    private List<Expense> expenseList;

    private double balance;

    public Account(String name,double balance) {
        this.name = name;
        this.balance = balance;
        expenseList = new ArrayList<>();
    }

    public void addExpence(Expense expense){

        balance += expense.getAmount();
        Category category = null;
        for (Expense e : expenseList){
            if(e.getBudgetCategory().equals(expense.getBudgetCategory())){
                category = expense.getBudgetCategory();
                break;
            }
        }
        if(!expenseList.contains(expense)){
            System.out.println("Successfuly added a new expence");
            expenseList.add(expense);
        }
        else if( category != null) {
            int index = expenseList.indexOf(expense);
            expenseList.get(index).deposit(expense.getAmount());
            System.out.println("Successfuly added to the expence " + expense.getBudgetCategory());

        }
    }

    public void removeExpence(Expense expense){
        if(expenseList.contains(expense)){
            expenseList.remove(expense);
            System.out.println("Successfuly removed");
        }
        else {
            System.out.println("Can't find and remove the expence");
        }
    }

    protected double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account %s-15 %f".formatted(name,balance);
    }
}
