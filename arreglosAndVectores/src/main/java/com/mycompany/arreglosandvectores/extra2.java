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
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son 
        iguales (la comparación deberá detenerse en cuanto se detecte alguna 
        diferencia entre los elementos).
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int[] vector1 = new int[n];
        
        llenar(vector,n);
        System.out.println("     ");
        llenar1(vector1,n);
        System.out.println(" ");
        iguales(vector,vector1,n);
    }
    public static void llenar(int [] vector,int n){
        for (int i = 0; i <vector.length; i++) {
            vector[i]=(int)(Math.random()*10);
            if(i==0){
                System.out.print("[" + vector[i]);
                
            }else{
                if(i == n-1){
                    System.out.print(vector[i] + "]");
                }else{
                    System.out.print(" " + vector[i] + " ");
                }
            }
        }
        
    }
    
    public static void llenar1(int [] vector1,int n){
        for (int i = 0; i <vector1.length; i++) {
            vector1[i]=(int)(Math.random()*10);
            if(i==0){
                System.out.print("[" + vector1[i]);
                
            }else{
                if(i == n-1){
                    System.out.print(vector1[i] + "]");
                }else{
                    System.out.print(" " + vector1[i] + " ");
                }
            }
        }
        
    }
    
    public static void iguales(int[] vector, int[] vector1,int n){
        boolean resultado = true;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector1.length; j++) {
                if (vector[i]!=vector1[j]) {
                resultado = false;
                break;
                
            }
            }
            
        }
        System.out.println("Los vectores son iguales? " + resultado);
    }
}
