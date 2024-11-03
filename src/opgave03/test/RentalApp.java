package opgave03.test;

import opgave03.model.Car;
import opgave03.model.Rental;


public class RentalApp {
    public static void main(String[] args) {
        Car bmw = new Car("1","2018",800);
        Car mercedes = new Car("2", "2024", 1800);
        Car peugeot = new Car("3", "2015", 500);

        Rental booking1 = new Rental(1,"03-11-2024", 2, bmw);
        Rental booking2 = new Rental(2,"13-10-2024", 5, mercedes);
        Rental booking3 = new Rental(3,"23-09-2024", 10, peugeot);

        System.out.println("Booking 1 pris er: " + booking1.getPrice() + " DKK");
        System.out.println("Booking 2 pris er: " + booking2.getPrice() + " DKK");
        System.out.println("Booking 3 pris er: " + booking3.getPrice() + " DKK");


    }
}
