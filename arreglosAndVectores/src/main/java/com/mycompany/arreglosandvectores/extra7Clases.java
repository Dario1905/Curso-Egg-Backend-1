/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglosandvectores;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class extra7Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir la dimension del vector: ");
        int  dim = leer.nextInt();
        int vector[] = new int[dim];
        int a = 0, b = 1, c;
        for (int i = 0; i < dim; i++) {
            System.out.print(" " + a);
            c = a + b;
            a = b;
            b = c;
    }
    
}
