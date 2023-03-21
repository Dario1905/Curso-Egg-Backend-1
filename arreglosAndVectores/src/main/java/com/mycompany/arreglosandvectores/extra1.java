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
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos 
        de un vector de tamaño N, con los valores ingresados por el usuario.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el elemento de la posicion " + i );
            vector[i]=leer.nextInt();
            
            
        }
        print(vector);
        System.out.println("      ");
        sumarVector(vector);
    }
    public static void print(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    
   
    }
    public static void sumarVector(int[]vector){
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es " + suma);
    }
}
