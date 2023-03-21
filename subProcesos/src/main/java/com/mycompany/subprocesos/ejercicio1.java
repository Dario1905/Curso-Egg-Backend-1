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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda 
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
        tener una función para cada operación matemática y deben devolver sus 
        resultados para imprimirlos en el main. 
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b = leer.nextInt();
        int opcion;
        System.out.println("Ingrese una opcion: ");
        System.out.println("1)Suma");
        System.out.println("2) Resta");
        System.out.println("3)Multiplicacion");
        System.out.println("4)Division");
        System.out.println("5) Salir");
        opcion = leer.nextInt();
        switch(opcion){
                case 1:
                    int resultado = suma(a,b);
                    
                    System.out.println("La suma es: " + resultado);
                
                case 2:
                    int resultado1 = resta(a,b);
                    System.out.println("La resta es " + resultado1);
                    
                case 3:
                    int resultado2 = multiplicacion(a,b);
                    System.out.println("La multiplicacion es " + resultado2);
                    
                case 4:
                    int resultado3 = dividir(a,b);
                    System.out.println("La division es "+ resultado3);
                    
                case 5:
                    System.out.println("Adios!");
                    break;
        }       
        
    } 
    public static int suma(int a, int b){
        int c = a + b;
       return c; 
    }
    public static int resta(int a, int b){
        int d = a - b;
        return d;
    }
    public static int multiplicacion(int a, int b){
        int e = a * b;
        return e;
    }
    public static int dividir(int a, int b){
        int f = a/b;
        return f;
    }
    }

