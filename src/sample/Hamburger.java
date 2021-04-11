package sample;

public class Hamburger implements Food{
    static String[] toppingsTypes = {"Pickles", "Onions", "Tomatoes", "Lettuce"};
    private String[] toppings;
    private String type;
    static final String[] burgerTypes = {"Cheese", "Chicken", "Chili", "Excessive", "Vegan", "Secret"};
    private static final double[] burgerPrices = {13.0, 13.65, 20.00, 37.33, 25.04, 99.99};
    private String[] burgerQuality = {"Good", "Bad"};
    private String quality;

    public Hamburger(String[] toppingsChoose, String typeChoose) {
        toppings = toppingsChoose;
        type = typeChoose;
    }

    public String[] getToppings(){
        return toppings;
    }

    public String getType(){
        return type;
    }

    public void setBurgerQuality(Employee emp) {
        if (emp.getCompetence() >= 5) {
            quality = burgerQuality[0];
        }
        else quality = burgerQuality[1];
    }

    public void showPrice() {
        System.out.println("Price of " + type + " burger is" + this.getPrice(type));
    }

    public double getPrice(String type) {
        double priceSum = 0.0;
        boolean found = false;
        for (int i = 0; i < burgerTypes.length; i++) {
            if (type.equalsIgnoreCase(burgerTypes[i])) {
                priceSum += burgerPrices[i];
                found = true;
            }
        }

        if (!found) {
            System.out.println("Sorry, we don't serve this burger.");
        }

        return priceSum;
    }

    public void switchType(String typeSwitch){
        type = typeSwitch;
    }
}
