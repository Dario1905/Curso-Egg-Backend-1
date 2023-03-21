/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        String nombre = "Dario";
        Integer folowersInstagram = 3281;
        Integer folowersYoutube = 5500;
        String frase = "Hola, mi nombre es " + nombre + " y tengo " + (folowersInstagram + folowersYoutube) + " seguidores en Instragram";
                
        System.out.println(frase);
        
        Integer edad = 20;
        if (edad > 18) {
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }
    }
}
