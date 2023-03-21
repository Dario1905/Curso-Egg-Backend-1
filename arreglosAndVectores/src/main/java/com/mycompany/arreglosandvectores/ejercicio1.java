/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglosandvectores;

/**
 *
 * @author Admin
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros 
        números enteros y los muestre por pantalla en orden descendente.
        */
        int numerodeelementos = 100;
        int aux;
        int [] arreglo = new int [numerodeelementos +1];
        
        for(int i = 0; i <= arreglo.length;i++){
            arreglo[i]=i;
        }
        
        for(int i = 0; i <= arreglo.length; i++){
            for(int j = i + 1; j <= arreglo.length; j++){
               if(arreglo[i] > arreglo[j]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] =aux;
               }
            }
        }
        
        
    }   
}
