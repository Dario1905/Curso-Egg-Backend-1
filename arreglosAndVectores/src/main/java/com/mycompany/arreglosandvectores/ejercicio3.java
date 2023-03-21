/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglosandvectores;

/**
 *
 * @author Admin
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son 
        de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        int cont1=0, cont2=0, cont3=0,cont4=0,cont5=0;
        
        int [] vector = new int[100];
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random()*100000);
            System.out.println(vector[i]);
        }
        for(int i = 0; i < vector.length; i++){
            if(vector[i]>=0 && vector[i]<10){
                cont1 ++;
            }
            if(vector[i]>=10 && vector[i]<100){
                cont2 ++;
            }
            if(vector[i]>=100 && vector[i]<1000){
                cont3 ++;
            }
            if(vector[i]>=1000 && vector[i]<10000){
                cont4 ++;
            }
            if(vector[i]>=10000 && vector[i]<100000){
                cont5 ++;
            } 
        }
        System.out.println("Una cifra " + cont1);
        System.out.println("Dos cifras " + cont2);
        System.out.println("Tres cifras " + cont3);
        System.out.println("Cuatro cifras " + cont4);
        System.out.println("Cinco cifras " + cont5);
    }
    
}
