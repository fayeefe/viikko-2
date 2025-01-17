package main;

import java.util.Scanner;

public class App {
    boolean cont = true;
    char input;

    public static void main(String[] args) {

        Car car  = new Car();
        car.status();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna auton merkki: ");
        car.make = scanner.next();
        System.out.println("Anna auton malli: ");
        car.model = scanner.next();
        System.out.println("Anna auton nopeus: ");
        car.speed = scanner.nextInt();

        car.status();
        
        /*  switch (args) {
            case value:
                
                break;
        
            default:
                break;
        } */
    }
}