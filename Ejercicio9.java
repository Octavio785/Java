import java.util.Scanner;
public class Ejercicio9 {
  public static void main(String[]args) {
    //definir variables
    Scanner leer=new Scanner(System.in);
    int m;
    int p;
    int v;
    int b;
    double Valor=0;
    //Datos de entrada
    System.out.print("Autos de clave1 : ");
    m=leer.nextInt();
    System.out.print("Autos de clave2: ");
    p=leer.nextInt();
    System.out.print("Autos de clave3: ");
    v=leer.nextInt();
    System.out.print("Valor de los autos: ");
    b=leer.nextInt();
    Valor=m*b*0.1+p*b*0.07+v*b*0.05;
      System.out.println("Total a pagar: "+Valor);
      }
    }