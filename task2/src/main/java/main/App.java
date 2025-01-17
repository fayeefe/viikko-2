package main;

import java.util.Scanner;

public class App {

    public static void carInfo(Car car, Scanner scanner){
        System.out.print("Anna auton merkki: ");
        car.make = scanner.next();
        System.out.print("Anna auton malli: ");
        car.model = scanner.next();
    }

    public static void carInfoUpdate(Car car, Scanner scanner){
        System.out.print("Anna uusi auton merkki: ");
        car.make = scanner.next();
        System.out.print("Anna uusi auton malli: ");
        car.model = scanner.next();
    }

    public static void menuPrint(){
        System.out.println("1) Näytä auton tila");
        System.out.println("2) Muokkaa auton merkkiä ja mallia");
        System.out.println("3) Kiihdytä autoa");
        System.out.println("4) Hidasta autoa");
        System.out.println("0) Lopeta ohjelma"); 
    }

    public static void accellerate(Car car, Scanner scanner){
        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                int accelleration = scanner.nextInt();
                if (accelleration < 0){
                    System.out.println("Nopeuden täytyy olla positiivinen luku.");                    
                }
                else{
                    car.speed += accelleration;
                }   
    }

    public static void decelarate(Car car, Scanner scanner){
        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                int givenValue = scanner.nextInt();
                if (givenValue < 0){
                    System.out.println("Nopeuden täytyy olla positiivinen luku.");
                }
                else if (car.speed - givenValue <= 0){
                    car.speed = 0;
                }
                else {
                    car.speed = car.speed - givenValue;
                }
    }

    public static void main(String[] args) {

        boolean cont = true;
        Car car  = new Car();
        Scanner scanner = new Scanner(System.in);
        carInfo(car, scanner);
        while (cont == true) {
            menuPrint();
            switch (scanner.next()) {
            case "1":
                car.status();
                break;
            case "2":
                carInfoUpdate(car, scanner);
                break;
            case "3":                
                accellerate(car, scanner);
                break;
            case "4":
                decelarate(car, scanner);
                break;
            case "0":
                System.out.println("Kiitos ohjelman käytöstä.");
                System.exit(0);
            default:
                System.out.println("Syöte oli väärä");
                break;
            }           
            
        }
    }
}