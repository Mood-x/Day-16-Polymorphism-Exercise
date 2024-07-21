import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();
        int ch = 0;

        while(true){
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.println("-----------------------");
            System.out.print("Enter your choice: ");
            try {
                ch = input.nextInt();

                switch(ch){
                    case 1:
                        System.out.print("Enter Car Model: ");
                        String carModel = input.next();

                        System.out.print("Enter Rental Days: ");
                        int carDays = input.nextInt();

                        Vehicle car = new Car(carModel, carDays);
                        rentedVehicles.add(car);
                        car.displayDetails();
                        break;

                    case 2:
                        System.out.print("Enter Bike Brand: ");
                        String bikeBrand = input.next();

                        System.out.print("Enter Rental Hour: ");
                        double bikeHours = input.nextDouble();

                        Vehicle bike = new Bike(bikeBrand, bikeHours);
                        bike.displayDetails();
                        rentedVehicles.add(bike);
                        break;

                    case 3:
                        System.out.print("Enter Truck Type: ");
                        String truckType = input.next();

                        System.out.print("Enter Rental Week: ");
                        int truckWeeks = input.nextInt();

                        Vehicle truck = new Truck(truckType, truckWeeks);

                        truck.displayDetails();

                        rentedVehicles.add(truck);
                        break;

                    case 4:
                        rentedVehicles.forEach(rentedVehicle -> {
                            System.out.println("------------------------");
                            rentedVehicle.displayDetails();
                            System.out.println("------------------------");
                        });
                        break;

                    case 5:
                        return;
                        
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("ERROR: Please enter a valid choice");
                input.next();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }

}