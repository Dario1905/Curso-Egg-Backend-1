/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.subprocesos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una 
        función se lo pasamos por parámetro para que nos indique si es o no 
        un número primo, debe devolver true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5,
        sin embargo, 17 si es primo.
        */
        
        Scanner leer = new Scanner(System.in);
        int numero;
        int contador = 0;
        System.out.println("Ingrese un numero mayor a dos: ");
        numero = leer.nextInt();
        if(numero>=1){
            
           int esPrimo = primo(numero);
           
           if(esPrimo == 0){
               System.out.println("True");
           }else{
               System.out.println("False");
           }
            }
        
    
    
}
    public static int primo(int numero){
        
        int contador = 0;
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                contador ++;
                
            }
        }
        if(contador ==2){
            int c = 0;
            return c;
        }else{
            int c = 1;
            return c;
        }
       
        
    }

    }

    
      


