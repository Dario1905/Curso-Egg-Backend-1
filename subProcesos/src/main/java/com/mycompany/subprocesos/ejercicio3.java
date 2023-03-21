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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una 
        cantidad de euros introducida por teclado a otra moneda, estas pueden 
        ser a dólares, yenes o libras. La función tendrá como parámetros, 
        la cantidad de euros y la moneda a convertir que será una cadena, este 
        no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        
        Scanner leer = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese el monto de euros: ");
        cantidad = leer.nextInt();
        String opcion;
        int salir;
        do{
            System.out.println("A que moneda lo quiere convertir?");
            System.out.println("A) Dolares");
            System.out.println("B) Yenes");
            System.out.println("C) Libras");
            //System.out.println("D Salir");
            opcion = leer.next();
            String opcion1 = opcion.toUpperCase();
            switch(opcion1){
                case "A":
                    mostrarDolares(cantidad);
                    break;
                case "B":
                    mostrarYenes(cantidad);
                    break;
                case "C":
                    mostrarLibras(cantidad);
                    break;
                
            }
            System.out.println("Desea realizar otra operacion? 0(SI)/1(NO)");
            salir = leer.nextInt();
            
        }while(salir != 1);
    }
    
    public static void mostrarDolares(int cantidad){
        double dolares = cantidad * 1.28611;
        System.out.println("Son " + dolares + " dolares.");
               
    }
    public static void mostrarYenes(int cantidad){
        double yenes = cantidad * 129.852;
        System.out.println("Son " + yenes + " yenes.");
    }
    public static void mostrarLibras(int cantidad){
        double libras = cantidad * 0.86;
        System.out.println("Son " + libras + " libras.");
    }
}
