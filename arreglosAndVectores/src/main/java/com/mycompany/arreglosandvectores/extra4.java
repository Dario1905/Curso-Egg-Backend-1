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
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los profesores del curso de programación de Egg necesitan llevar un 
        registro de las notas adquiridas por sus 10 alumnos para luego obtener 
        una cantidad de aprobados y desaprobados. Durante el período de cursado 
        cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 
        por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el 
        arreglo. Al final del programa los profesores necesitan obtener por 
        pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta 
        que solo aprueban los alumnos con promedio mayor o igual al 7 de sus 
        notas del curso.
        */
        
        Scanner leer = new Scanner(System.in);
        int n = 10;
        float [] notas = new float [n];
        int aprobados=0;
        int desaprobados=0;
        
        
        for (int i = 0; i < n-1; i++) {
            float promedio =0;
            float primerTrabajo =0;
            float segundoTrabajo =0;
            float primerIntegrador =0;
            float segundoIntegrador =0;
            
            System.out.println("Nota del alumno " + n +": " );
            
            System.out.println("Ingrese la nota del 1º trabajo: ");
            primerTrabajo = leer.nextInt();
            
            System.out.println("Ingrese la nota del 2º trabajo: ");
            segundoTrabajo = leer.nextInt();
            
            System.out.println("Ingrese la nota del 1º Integrador:");
            primerIntegrador = leer.nextInt();
            
            System.out.println("Ingrese la nota del 2º Integrador:");
            segundoIntegrador = leer.nextInt();
            
            promedio +=(primerTrabajo *0.1) + (segundoTrabajo*0.15)+ (primerIntegrador * 0.25) + (segundoIntegrador *0.5);
            
            notas[i]=promedio;
            
            if (promedio >=7) {
                aprobados ++;
            }else{
                desaprobados ++;
            }
            
           
        }
        System.out.println("La cantidad de alumnos evaluados son " + n + " aprobaron: " + aprobados + " y desaprobaron: " + desaprobados);
        System.out.println(" ");
        System.out.println("La lista de notas se detalla a continuacion: ");
        for (int i = 0; i < notas.length; i++) {
            if(i==0){
                System.out.print("[" + notas[i]);
                
            }else{
                if(i == n-1){
                    System.out.print(notas[i] + "]");
                }else{
                    System.out.print(" " + notas[i] + " ");
                }
            }
            
        }
    }
    
}
