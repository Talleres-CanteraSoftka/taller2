package com.softka;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * in this method main we can create different types of spacecrafts and assing a name to them.
 * while (!exit) brings the menu again after we create a spacecraft.
 * switch (option) gives different options to the users to choose what type of spacecraft they want to build.
 * default gives a message telling the user to write a different number.
 * catch helps us to avoid the program to crach in case the users enter a letter or something different than a number
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option;
        Spacecraft ship1 = new MannedSpacecraft() {
        };
        Spacecraft ship2 = new MannedSpacecraft() {
        };
        Spacecraft ship3 = new MannedSpacecraft() {
        };
        Spacecraft ship4 = new MannedSpacecraft() {
        };
        while (!exit) {
            System.out.println(" Welcome to Spacecraft builder, below you can select the number of the spacecraft you want to create");
            System.out.println("1. MannedSpacecraft");
            System.out.println("2. Shuttle Vehicles");
            System.out.println("3. UnmannedSpacecraft");
            System.out.println("4. Hybrid Manned Shuttle Vehicles");
            System.out.println("5. Exit");
            try {
                System.out.println("now you can write one of the options and then push enter");
                option = scanner.nextInt();
                switch (option) {
                    case 1:

                        new MannedSpacecraft() {
                        };
                        System.out.println("Write the name of the spacecraft you want to create:");
                        scanner.nextLine();
                        ship1.setName(scanner.nextLine());
                        System.out.println("Congratulations you have built a Manned Spacecraft and the name is " + ship1.getName());
                        System.out.println("_______________________________________________________________________________________");

                        break;
                    case 2:
                        new ShuttleVehicles() {
                        };
                        System.out.println("Write the name of the spacecraft you want to create:");
                        scanner.nextLine();
                        ship2.setName(scanner.nextLine());
                        System.out.println("Congratulations you have built a Shuttle Vehicle and the name is " + ship2.getName());
                        System.out.println("_______________________________________________________________________________________");



                        break;
                    case 3:
                        new UnmannedSpacecraft() {
                        };
                        System.out.println("Write the name of the spacecraft you want to create:");
                        scanner.nextLine();
                        ship3.setName(scanner.nextLine());
                        System.out.println("Congratulations you have built a Unmanned Spacecraft and the name is " + ship3.getName());
                        System.out.println("_______________________________________________________________________________________");

                        break;
                    case 4:
                        new HybridMannedShuttleVehicles() {
                        };
                        System.out.println("Write the name of the spacecraft you want to create:");
                        scanner.nextLine();
                        ship4.setName(scanner.nextLine());
                        System.out.println("Congratulations you have built a Hybrid Manned Shuttle Vehicle and the name is " + ship4.getName());
                        System.out.println("_______________________________________________________________________________________");


                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Sorry at the moment only the options between 1 and 5 are available");
                }


            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.next();
            }
        }
    }
}

