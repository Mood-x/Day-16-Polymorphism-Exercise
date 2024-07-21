public class Truck implements Vehicle{

    private String type;
    private int weeks;

    public Truck(){}

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getweeks() {
        return weeks;
    }

    public void setweeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return weeks * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type: " + type + " Truck");
        System.out.println("weekly Rental Rate: $500");
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
