import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[]args) {
 
       Scanner leer=new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = leer.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=20; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}
