package sample;
import java.util.ArrayList;

public class Restaurant{
    private static double balance = 0;
    ArrayList<Employee> emps = new ArrayList<Employee>();
    String[] names = {"Tim"};
    Employee x = new Employee(names[0]);
    boolean y = emps.add(x);

    public Restaurant() {
        balance = 100;
    }
    public Restaurant(double startBalance) {
        balance = startBalance;
    }

    /*

    public void showOrder(Customer cus, Ticket tick) {
        System.out.println(Customer.name + " has ordered " + tick.burgerCount + " and "
                + tick.drinkCount + "drinks for a total of $" + tick.getPrice() + ".");
    }

    */


}
