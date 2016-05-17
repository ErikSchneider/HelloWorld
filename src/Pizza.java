/**
 * Created by Erik on 5/16/16.
 */
public class Pizza {
    String crust;
    int size;
    String toppings;
    int numberOfToppings;
    double price;

    public Pizza(String crust, int size, String toppings, int numberOfToppings, double price) {
        this.crust = crust;
        this.size = size;
        this.toppings =toppings;
        this.numberOfToppings = numberOfToppings;
        this.price = price;
    }
    public String getCrust() {
        return crust;
    }
    public void setCrust(String newCrust) {
        crust = newCrust;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int newSize) {
        size = newSize;
    }
    public String getToppings() {
        return toppings;
    }
    public void setToppings(String newToppings) {
        toppings = newToppings;
    }
    public int getNumberOfToppings() {
        return numberOfToppings;
    }
    public void setNumberOfToppings(int newNumberOfToppings) {
        if (is3Toppings(newNumberOfToppings)) {
            numberOfToppings = newNumberOfToppings;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    public static boolean is3Toppings(double newNumberOfToppings) {
        return newNumberOfToppings >= 3;
    }
}

