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
public class extra1Clases {

   private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un 
    vector de tamaño N, con los valores ingresados por el usuario.*/
        System.out.println("Ingrese el orden del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenar(vector);
        print(vector);
    }

    public static void llenar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el numero para la posicion: " + i);
            vector[i] = leer.nextInt();
        }

    }

    public static void print(int[] vector) {
        System.out.println("Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i]+"]");
        }
        System.out.println("");
    }
}
    
}
