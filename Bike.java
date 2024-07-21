public class Bike implements Vehicle{
    private String brand;
    private double hours;

    public Bike(){}

    public Bike(String brand, double hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double gethours() {
        return hours;
    }

    public void sethours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hours * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike brand: " + brand + " Bike");
        System.out.println("hourly Rental Rate: $10");
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
