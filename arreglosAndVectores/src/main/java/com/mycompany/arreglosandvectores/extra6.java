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
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
        caracteres y, a medida que el usuario las va ingresando, construya 
        una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
        Las palabras se ubicarán todas en orden horizontal en una fila que 
        será seleccionada de manera aleatoria. Una vez concluida la ubicación 
        de las palabras, rellene los espacios no utilizados con un número 
        aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa 
        de letras creada.

        
        */
        
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        String palabra;
        
        for (int a = 0; a < 4; a++) {
            System.out.println("Ingrese una palabra entre 3 y 5 caracteres: ");
            palabra = leer.next();
            while(palabra.length()<3 || palabra.length()>=6){
                System.out.println("Incorecto! Reingrese otra palabra: ");
                palabra = leer.next();
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = 
                }
                
            }
        }
    }
    
}
