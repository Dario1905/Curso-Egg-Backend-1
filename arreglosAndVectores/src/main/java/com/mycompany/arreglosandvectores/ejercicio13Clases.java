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
public class ejercicio13Clases {

    /**
     * @param args the command line arguments
     */
    
        /* EJERCICIO 13
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
    de equipo y define su tipo de dato de tal manera que te permita alojar sus 
    nombres más adelante.
    EJERCICIO 14
    Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus 
    compañeros de equipo
     */
    public static void main(String[] args) {
        String[] Equipo = new String[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese el nombre de un compañero de equipo:");
            Equipo[i] = sc.next();
        }

        System.out.println("Equipo registrado exitosamente!");
        System.out.println("Los nombres ingresados fueron:");
        
      
        for (String elemento : Equipo) {
            System.out.println(elemento);//solo sirve para mostrar el vector
        }
        
        //System.out.println(Arrays.toString(Equipo)); imprime los elementos de un vector
    }

}
    
    

