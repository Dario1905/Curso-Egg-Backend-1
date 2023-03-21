/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava;

/**
 *
 * @author Admin
 */
public class ClaseString {
    public static void main(String[] agrs){
        String nombre = "Dario";
        String nombre1 ="DARIO";
        System.out.println(" La variable nombre tiene " +nombre.length() + " caracteres");
        System.out.println(nombre1.charAt(4));
        //compara si dos cadenas son iguales, si lo son es true
        System.out.println(nombre.equals(nombre1));
        
        //Sirve para comparar si dos cadenas son iguales, ignorando la grafía de la palabra. 
        //Devuelve true si son iguales y false si no.
        System.out.println(nombre.equalsIgnoreCase(nombre1));
        
        //Compara dos cadenas de caracteres alfabéticamente. Retorna 0 si son iguales, 
        //entero negativo si la primera es menor o entero positivo si la primera es mayor.
        System.out.println(nombre.compareTo(nombre1));
        
        //Concatena la cadena del parámetro al final de la primera cadena.
        System.out.println(nombre.concat(nombre1));
        
        //Retorna true si la cadena contiene la secuencia tipo char del parámetro.
        System.out.println(nombre1.contains(nombre));
        
        //Retorna verdadero si la cadena es igual al objeto del parámetro
        System.out.println(nombre.endsWith("Dario"));
        
        //Retorna el índice de la primera ocurrencia de la cadena del parámetro
        System.out.println(nombre.indexOf("Damian"));










        


        
    }
    
}
