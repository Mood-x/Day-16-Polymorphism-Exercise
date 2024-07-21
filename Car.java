public class Car implements Vehicle{

    private String model;
    private double days;


    public Car() {}
    public Car(String model, double days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days * 50;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Daily Rental Rate: $50");
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
