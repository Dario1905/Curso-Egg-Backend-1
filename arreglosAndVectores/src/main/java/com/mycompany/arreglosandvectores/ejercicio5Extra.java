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
public class ejercicio5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que llene una matriz de tamaño NxM con 
        valores aleatorios y muestre la suma de sus elementos.
       */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int n = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int m = leer.nextInt();
        
        int[][] matriz = new int [n][m];
        llenarMatriz(matriz);
        sumarMatriz(matriz);
        

    }

    private static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                
                
            }
        }
    }

    private static void sumarMatriz(int [][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];   
                
            }
            
        }
        System.out.println("La suma de los elementos de las matrices es " + suma);
    }    
}
