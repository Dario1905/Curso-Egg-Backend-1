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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e 
        imprima los datos de las personas ingresadas por teclado e indique 
        si son mayores o menores de edad. Después de cada persona, el programa 
        debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
        cuando el usuario ingrese la palabra “No”.
        */
        Scanner leer = new Scanner(System.in);
        String nombre,opcion;
        int edad;
        do{
            System.out.println("Ingrese su nombre: ");
            nombre = leer.next();
            System.out.println("Ingrese la edad: ");
            edad = leer.nextInt();
           
            String mayorDeEdad = mayor(edad);
            
            System.out.println("Su nombre es " + nombre + " su edad es " + edad + mayorDeEdad);
            System.out.println("Desea salir?");
            opcion = leer.next();
        }while(opcion =="si");
    }
    public static String mayor (int edad) {
        edad = (int)edad;
        String c;
        if(edad >= 18){
             c = "Es mayor de edad";
             return c;
        }else{
            c = "Es menor de edad";
            return c;
        }
        
    }
}
