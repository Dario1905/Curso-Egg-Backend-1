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
public class ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = suma(10, 5); //llamo a la funcion suma
        System.out.println("El resultado de la suma es " + resultado);
        String nombre ="Homero";
        saludar(nombre); // llamo a la funcion saludar
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        saludar(nombre);
        
        saludar(leer.next());
        
        
    }
    public static int suma(int num, int num1){
        
        int c = num + num1;
        return c;
    }
    
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre + " como estas?");
    }
}
