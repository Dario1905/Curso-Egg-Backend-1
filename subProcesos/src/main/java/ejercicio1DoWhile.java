
import static com.mycompany.subprocesos.ejercicio1.dividir;
import static com.mycompany.subprocesos.ejercicio1.multiplicacion;
import static com.mycompany.subprocesos.ejercicio1.resta;
import static com.mycompany.subprocesos.ejercicio1.suma;
import java.util.Scanner;


public class ejercicio1DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int b = leer.nextInt();
        int opcion;
        do{
            
            System.out.println("Ingrese una opcion: ");
            System.out.println("1)Suma");
            System.out.println("2) Resta");
            System.out.println("3)Multiplicacion");
            System.out.println("4)Division");
            System.out.println("5) Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    int resultado = suma(a,b);
                    
                    System.out.println("La suma es: " + resultado);
                    break;
                case 2:
                    int resultado1 = resta(a,b);
                    System.out.println("La resta es " + resultado1);
                    break;
                case 3:
                    int resultado2 = multiplicacion(a,b);
                    System.out.println("La multiplicacion es " + resultado2);
                    break;
                case 4:
                    int resultado3 = dividir(a,b);
                    System.out.println("La division es "+ resultado3);
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
           }        
               
        }while(opcion != 5);
    }
     public static int suma(int a, int b){
        int c = a + b;
       return c; 
    }
    public static int resta(int a, int b){
        int d = a - b;
        return d;
    }
    public static int multiplicacion(int a, int b){
        int e = a * b;
        return e;
    }
    public static int dividir(int a, int b){
        int f = a/b;
        return f;
    }
}
