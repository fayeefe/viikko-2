package main;

import java.util.Scanner;

public class App {

    public static void menuPrint(){
        System.out.println("1) Näytä auton tila");
        System.out.println("2) Muokkaa auton merkkiä ja mallia");
        System.out.println("3) Kiihdytä autoa");
        System.out.println("4) Hidasta autoa");
        System.out.println("0) Lopeta ohjelma");
    }

    public static void main(String[] args) {
        boolean cont = true;
        Car car  = new Car();
        car.status();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna auton merkki: ");
        car.make = scanner.next();
        System.out.println("Anna auton malli: ");
        car.model = scanner.next();
        System.out.println("Anna auton nopeus: ");
        car.speed = scanner.nextInt();

        while (cont == true) {
            menuPrint();
            switch (scanner.nextInt()) {
                case 1:
                    car.status();
                    break;
                
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
    }
}