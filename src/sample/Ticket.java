package sample;
import java.util.ArrayList;

public class Ticket {
    private ArrayList<Food> items;
    //String name;
    //int burgerCount, drinkCount;

    String showTicket(){
        String output = "";
        for (int i = 0; i < items.size(); i++){
            Food f = items.get(i);
            if (f instanceof Hamburger){
                Hamburger hamburger = (Hamburger) items.get(i);
                output = output + hamburger.getType() + " burger";
                //maybe put in a loop that adds the toppings
                output += "\n";
            }
            else if (f instanceof Drinks){
                Drinks drink = (Drinks) items.get(i);
                output = output + drink.getSize() + " " + drink.getFlavor() + " drink\n";
            }
        }
        return output;
    }

    void addBurger(int i, String[] toppings){
        Hamburger h = new Hamburger(toppings, Hamburger.burgerTypes[i]);
        items.add(h);
    }

    void addDrink(int size, int flavor){
        Drinks d = new Drinks(Drinks.flavors[flavor], Drinks.drinkTypes[size]);
        items.add(d);
    }


}
