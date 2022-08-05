package DefiningClasses_Lab;

import CarConstructors.Car;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car("Lada", "Niva", 1000);
//        car.brand = "Lada";
//        car.model = "Niva";
//        car.horsePower = 1000;

//        System.out.printf("This car is: %s %s %d HP."
//                , car.brand, car.model, car.horsePower);
        car.setHorsePower(500);

        String s = car.toString();
        System.out.println(s);


    }
}
