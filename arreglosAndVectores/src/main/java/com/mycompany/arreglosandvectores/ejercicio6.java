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
public class ejercicio6 {

    /*
     Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 
    9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
    Crear un programa que permita introducir un cuadrado por teclado y determine 
    si este cuadrado es mágico o no. El programa deberá comprobar que los números
    introducidos son correctos, es decir, están entre el 1 y el 9.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        cargar(matriz);
        print(matriz);
        verificar(matriz);
    }
    public static void cargar(int [][] matriz){
        Scanner leer = new Scanner(System.in);
        int a;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese en la posicion [" + i + "," + j + "] un numero: ");
                a=leer.nextInt();
                while((a<=0) ||(a >= 10) ){
                    System.out.println("Incorrecto, reingrese el numero en la posicion [" + i + "," + j + "]");
                    a = leer.nextInt();
                }
                matriz[i][j]=a;
                
            }
        }
    }
    
    public static void print(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
                
            }System.out.println(" ");
            
        }System.out.println(" ");
    }
    
    public static void verificar(int [][] matriz){
        int diagonalP=0;
        int diagonalS=0;
        int fila1 =0, fila2=0, fila3=0;
        int columna1=0, columna2 =0, columna3 =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j){
                    diagonalP += matriz[i][j];
                }
                if (i+j<matriz.length){
                    diagonalS += matriz[i][j];
                }
                if(i==0){
                    fila1 += matriz[i][j];
                }
                if(i==1){
                    fila2 += matriz[i][j];
                }
                if(i==2){
                    fila3 += matriz[i][j];
                }
                if(j==0){
                    columna1 += matriz[i][j];
                }
                if(j==1){
                    columna2 += matriz[i][j];
                }
                if(j ==2){
                    columna3 += matriz[i][j];
                }
            }
        }
        System.out.print(diagonalP);
        System.out.println(" ");
        System.out.print(fila2);
        if((diagonalP==diagonalS) && (diagonalS==fila1) && (fila1 == fila2) && (fila2==fila3) &&(fila3==columna1) && (columna1==columna2) && (columna2 ==columna3)){
            System.out.println("La matriz es màgica!!!!!");
        }else{
            System.out.println("La matriz no es magica...");
        }
    }
}
