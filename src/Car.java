/**
 * Created by Erik on 5/16/16.
 */
public class Car {
    String make;
    String model;
    int year;
    boolean isNew;
    double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;

    }
    public String getMake() {
        return make;
    }
    public void setMake(String newMake) {
        make = newMake;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String newModel) {
        model = newModel;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int newYear) {
        year = newYear;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice) {
        if(isLowPrice (newPrice)) {
            price = newPrice;
        }
    }
    public static boolean isLowPrice (Double newPrice) {
        return newPrice <= 5000;
    }



}
