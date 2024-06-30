import java.util.ArrayList;
import java.util.List;

public class BudgetCategory {
    private Category name;
    private double amount;
    private List<Expense> expenseList;

    public BudgetCategory(Category name, double amount) {
        this.name = name;
        this.amount = amount;
        expenseList = new ArrayList<>();
    }

    public Category getCategory() {
        return name;
    }
}

enum Category{
    FOOD, TRANSPORT,HOUSE,FAMILY,GIFTS,OTHERS
}

