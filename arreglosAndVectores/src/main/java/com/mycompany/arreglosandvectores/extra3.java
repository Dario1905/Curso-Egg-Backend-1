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
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una función rellene un vector con números aleatorios, 
        pasándole un arreglo por parámetro. Después haremos otra función 
        o procedimiento que imprima el vector.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenarVector(vector);
        print(vector,n);
        

    }
    public static void llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10);
        }
    }
    public static void print(int[] vector, int n){
        for (int i = 0; i < vector.length; i++) {
            if(i==0){
                System.out.print("[" + vector[i]);
                
            }else{
                if(i == n -1){
                    System.out.print( vector[i] + "]");
                }else{
                    System.out.print(" " + vector[i] + " ");
                }
            }
        }
    }
    
}
