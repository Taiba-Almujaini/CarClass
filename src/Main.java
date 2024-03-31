import object.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car Make");
        String carMake=sc.nextLine();
        System.out.println("Enter the car Model");
        String carModel=sc.nextLine();
        System.out.println("Enter the car year");
        Integer carYear= sc.nextInt();
        Car car=new Car(carMake,carModel,carYear);

        System.out.println("Car make :"+car.getCarMake());
        System.out.println("Car Model :"+car.getCarModel());
        System.out.println("Car Year :"+car.getCarYear());

    }
}