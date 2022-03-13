package ca5.d00242634;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    JewelleryManager JewelleryManager;  // encapsulates access to list of Jewellery

    public static void main(String[] args) {

        Main main = new Main();
        main.start();
    }

    public void start() {

        JewelleryManager = new JewelleryManager();

        try {
            displayMainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Program ending, Goodbye");

    }

    private void displayMainMenu() throws IOException {
        final int JewelleryArrayList = 1;
        final int JewelleryHashMap = 2;
        final int JewelleryTree = 3;
        final int PriorityQueue = 4;
        final int Exit = 9;
        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("\n##################################");
            System.out.println("        Jewellery Shop");
            System.out.println("##################################");
            System.out.println("(1)JewelleryArrayList\n(2)JewelleryHashMap\n(3)JewelleryTreeMap\n(4)PriorityQueue\n(9)Exit");
            System.out.print("\nYour Choice: ");

            try {
                String userInput = keyboard.nextLine();
                option = Integer.parseInt(userInput);
                System.out.println("###################################\n");
                switch (option) {

                    case JewelleryArrayList:
                        System.out.println("Jewellery ArrayList chosen");
                        displayJewelleryMenu();
                        break;

                    case JewelleryHashMap:
                        System.out.println("Which entry would you like to see? 1-10");
                        Scanner sc = new Scanner(System.in);
                        int chooseHashMapEntry = sc.nextInt();
                        JewelleryManager.ApplyJewelleryToHashMap(chooseHashMapEntry);
                        break;

                    case JewelleryTree:
                        System.out.println("Jewellery TreeMap chosen");
                        System.out.println("\n printing tree map");
                        JewelleryManager.ApplyJewelleryToTreeMap();
                        break;

                    case PriorityQueue:
                        System.out.println("Jewellery PriorityQueue chosen");
                        JewelleryManager.JewelleryPriorityQueue();
                        break;

                    case Exit:
                        System.out.println("Exit Menu chosen");
                        break;

                    default:
                        System.out.print("Invalid option - enter number in range");
                        break;
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("##################################");
                System.out.println("Invalid option - please enter number in range");
            }
        } while (option != Exit);
        System.out.println("\nExiting Menu");
    }

    private void displayJewelleryMenu() {

        final int SHOW_ALL = 1;
        final int EXIT = 9;

        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("#####################");
            System.out.println("=     Jewellery    =");
            System.out.println("#####################");
            System.out.println("(1)Show All\n(9)Exit");
            System.out.print("\nYour Choice: ");
            try {
                String userInput = keyboard.nextLine();
                option = Integer.parseInt(userInput);
                System.out.println("########################");
                switch (option) {
                    case SHOW_ALL:
                        System.out.println("\n########################");
                        System.out.println("Display ALL Jewellery");
                        System.out.println("\n########################");
                        JewelleryManager.displayAllJewellerys();
                        break;
                    case EXIT:
                        System.out.println("####################");
                        System.out.println("Exit Menu option chosen");
                        System.out.println("####################");
                        break;
                    default:
                        System.out.print("Invalid option - please enter number in range");
                        break;
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Invalid option - please enter number in range");
            }
        } while (option != EXIT);
    }

}

