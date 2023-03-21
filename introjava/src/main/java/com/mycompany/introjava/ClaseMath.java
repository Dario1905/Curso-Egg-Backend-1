/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava;

/**
 *
 * @author Admin
 */
public class ClaseMath {
    public static void main(String[] agrs){
       int x = 16;
       double y = -3.15;
       //valor absoluto de un numero
       System.out.println(Math.abs(y));
       //devuelve el numero mayor
       System.out.println(Math.max(x,y));
       //devuelve el numero menor
       System.out.println(Math.min(x,y));
       //numero al azar entre 0 y 1
       System.out.println(Math.random());
       //redondea hacia arriba
       System.out.println(Math.round(y));
       //redondea hacia abajo
       System.out.println(Math.floor(y));
       //calcula la raiz cuadrada
       System.out.println(Math.sqrt(x));
    }
}
