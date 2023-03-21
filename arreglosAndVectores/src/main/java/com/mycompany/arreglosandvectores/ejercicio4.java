/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglosandvectores;

/**
 *
 * @author Admin
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores 
         aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta 
         de una matriz A se denota por B y se obtiene cambiando sus filas por 
         columnas (o viceversa).
        */
        int[][] matriz = new int [4][4];
        int[][] matrizT = new int [4][4];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(" " + matriz[i][j]);
                
            }
            System.out.println(" ");
            
            
        }
        System.out.println(" ");
        
        System.out.println("Matriz transpuesta: ");
        for( int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
               matrizT[j][i]=matriz[i][j];
                
            }    
            
        }
        for(int i = 0; i < matrizT.length; i++){
            for(int j = 0; j < matrizT.length; j++){
                System.out.print(" " +matrizT[i][j] );
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    
}
