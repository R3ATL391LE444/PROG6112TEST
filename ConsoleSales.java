/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingsalesreport;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    public void printReport() {
        System.out.println("\n===== CONSOLE SALES REPORT =====");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales: R" + getTotalSales());
        System.out.println("================================");
    }
}