package sample;

public class Drinks implements Food{
    static final String[] flavors = {"Plain", "Vanilla", "Strawberry", "Chocolate"};
    private String size;
    private String flavor;
    private int quantity;
    static final String[] drinkTypes = {"Small", "Medium", "Large", "Extra Large", "Secret"};
    private static final double[] drinkPrices = {1.65, 2.00, 4.33, 7.04, 99.99};
    private String[] drinkQuality = {"Good", "Bad"};
    private String quality;

    public Drinks(String flavorsChoose, String typeChoose) {
        flavor = flavorsChoose;
        size = typeChoose;
    }

    public String getSize(){
        return size;
    }
    public String getFlavor(){
        return flavor;
    }

    public void setDrinkQuality(Employee emp) {
        if (emp.getCompetence() >= 5) {
            quality = drinkQuality[0];
        }
        else quality = drinkQuality[1];
    }

    public void showPrice() {
        System.out.println("Price of " + size + " drink is" + this.getPrice(size));
    }

    public double getPrice(String type) {
        double priceSum = 0.0;
        boolean found = false;
        for (int i = 0; i < drinkTypes.length; i++) {
            if (type.equalsIgnoreCase(drinkTypes[i])) {
                priceSum += drinkPrices[i];
                found = true;
            }
        }

        if (!found) {
            System.out.println("We don't got this one, son!");
        }

        return priceSum;
    }

    public void switchType(String typeSwitch) {
        size = typeSwitch;
    }
}


