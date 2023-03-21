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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un número a buscar en el vector. 
        El programa mostrará dónde se encuentra el numero y si se encuentra repetido
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        int dimension = leer.nextInt();
        int[] vector = new int[dimension];
        for(int i = 0; i < vector.length; i++){
        vector[i]=(int)(Math.random()*10);
        }
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        
        for(int i = 0; i < vector.length; i++){
            if(numero == vector[i]){
                System.out.println("El numero "+ numero + " esta en la posicion " +i);
            }
        }
    }
    
}
