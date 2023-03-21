/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglosandvectores;

/**
 *
 * @author Admin
 */
public class ejercicio6Clases {

    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una 
matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
       int[][] matriz={{0,-2,4},{2,0,2},{-4,-2,0}};
       
       print(3,3,matriz);
       
        System.out.println("la matriz es antisimetrica?: "+ esAntisimetrica(matriz,trasponerMatriz(opuestaMatriz(matriz))));
        
    }

    public static void print(int filas, int columnas, int[][] matriz) {
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void llenar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

    }

    public static int[][] trasponerMatriz(int[][] matriz) {
        int[][] traspuesta = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("Traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + traspuesta[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        return traspuesta;

    }

    public static int[][] opuestaMatriz(int[][] matriz) {
        int[][] opuesta = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                opuesta[i][j] = -matriz[i][j];
            }
        }
        System.out.println("Opuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + opuesta[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        return opuesta;
    }

    public static boolean esAntisimetrica(int[][] matriz, int[][] opuesta) {
        boolean antisimetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] != opuesta[i][j]) {

                    antisimetrica = false;
                    break;
                }

            }
        }

        return antisimetrica;

    }

}
Mariano González 20:07
public static void main(String[] args) {
    /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por teclado
y determine si este cuadrado es mágico o no. El programa deberá comprobar que
los números introducidos son correctos, es decir, están entre el 1 y el 9.*/
    int [][] matriz={{2,7,6},{9,5,1},{4,3,8}};
    
    print(3,3,matriz);
    esMagica(matriz);
    
    

    }
    public static void print(int filas, int columnas, int[][] matriz) {
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static boolean esMagica(int[][] matriz) {
        boolean resultado=false;
        int sumaDP=0;
        int sumaFila=0;
        int sumaColumna=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    sumaDP+=matriz[i][j];
                }
                if (i==1) {
                    sumaFila+=matriz[i][j];
                }
                if (j==0) {
                    sumaColumna+=matriz[i][j];
                }
                
            }
        }
        if (sumaDP==sumaFila&&sumaDP==sumaColumna) {
            resultado=true;
            System.out.println("La Matriz es magica!!");
        }else{
            System.out.println("La Matriz no es magica, una pena");
        }
        
    
}
