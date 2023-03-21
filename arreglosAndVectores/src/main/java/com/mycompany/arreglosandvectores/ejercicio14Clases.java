/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglosandvectores;

/**
 *
 * @author Admin
 */
public class ejercicio14Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector con los 100 primeros
        números enteros y los muestre por pantalla en orden descendente.
        */
        //Scanner leer = new Scanner(System.in);
        int numero[] = new int[100];
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = i;
        }
        for (int i = numero.length-1; i >= 0; i--) {
            System.out.print(numero[i]+" ");
        }
        
    }
    
}
