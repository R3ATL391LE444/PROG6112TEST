/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingsalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ELECTRONICS STORE SALES");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");

        System.out.print("Select console type: ");
        int choice = input.nextInt();
        input.nextLine();

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PlayStation 5";
                break;

            case 2:
                consoleType = "Xbox";
                break;

            case 3:
                consoleType = "Nintendo Switch";
                break;

            default:
                consoleType = "Unknown Console";
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales =
                new ConsoleSales(consoleType, store, totalSales);

        sales.printReport();

        input.close();
    }
}