package sample;


public class Customer extends Restaurant{
    String[] cusNames = {"Cus1", "Cus2", "Cus3", "Cusp4", "Cus5", "Cus6"};
    private double budget;
    private String name;

    public Customer(double b, String n){
        budget = b;
        name = n;
    }

    public boolean saysThanks() {
        return true;
    }


}


