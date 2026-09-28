/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingsalesreport;

/**
 *
 * @author Student
 */
public class GamingSalesReport {

     public static void main(String[] args) {
 
      String[] cities = {
      "Cape Town",
      "Port Elizabeth",
      "Pretoria"
        };

        String[] consoles = {
        "PS5",
        "Xbox",
        "Nintendo Switch"
        };
        
        int[][] sales = {
        {1000, 2000, 3000},
        {2000, 3000, 4000},
        {1500, 1100, 1200}
        };

        int[] cityTotals = new int[cities.length];

        int highestSales = 0;
        int highestCityIndex = 0;

        System.out.println("NUMBER 1 ELECTRONICS");
        System.out.println("ANNUAL GAMING CONSOLE SALES REPORT");
        System.out.println("-----------------------------------------");

        
        for (int i = 0; i < cities.length; i++) {

        int total = 0;

        System.out.println("\nCity: " + cities[i]);

        for (int j = 0; j < consoles.length; j++) {

         System.out.println(
        consoles[j] + ": " + sales[i][j]
                );

         total += sales[i][j];
            }

            cityTotals[i] = total;

            System.out.println("Total sales: " + total);
           
            if (total > highestSales) {
                highestSales = total;
                highestCityIndex = i;
            }
        }

        System.out.println("\n-----------------------------------------");
        System.out.println("FINAL SALES SUMMARY");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(
                cities[i] + " total: " + cityTotals[i]
            );
        }

        System.out.println("\nCity with the most console sales: "
                + cities[highestCityIndex]);

        System.out.println("Highest total sales: " + highestSales);
    }
}