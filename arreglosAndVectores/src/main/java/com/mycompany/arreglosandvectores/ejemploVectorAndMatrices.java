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
public class ejemploVectorAndMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*declarar vector de una dimension
        
        */
        int [] vector;
        //dimensionamos el vector; de tamaño 2, con el valor cero por defecto.
        vector = new int[2];
        //o podemos hacer los dos pasos en una linea;
        int [] producto = new int [3];
        
        /*declaracion de una matriz de dos dimensiones, declaracion
        e inicializamos la matriz
        */
        
        int [][] matriz = {{4,8,6}, {2,1,7}};
        
        /*declaracion y creacion de arreglos genericos. 
        tipo [][]...nombreArreglo= new tipo [cardinal1] [cardinal2][cardinal3]
        */
        System.out.println("Ingrese los valores del vector de tamaño " +vector.length+":");
        Scanner leer = new Scanner(System.in);
        //i = 0, por que los subindices arrancan desde cero.
        
        for(int i =0; i < vector.length; i++){ //uso para cargar manual// la matriz
            System.out.println("v["+i+"]=");
            vector[i]=leer.nextInt();
            
                
        }
        //Multiplicamos vector por matriz
        int suma;
        //...para cada columna de la matriz
        for(int j =0; j < matriz[0].length; j++){
            suma = 0;
            //...recorro el vector y lo multiplico
            for(int i = 0; i < vector.length; i++){
              suma += vector[i] * matriz[i][j];
              
            }
            producto[j] = suma;
        }
        for(int elemento:producto){
            System.out.println(elemento);
        }
        
    }
    }
    

