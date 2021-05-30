import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[]args) {
    //definir variables
    Scanner leer=new Scanner(System.in);
    int d;
    int c;
    int u;
    int z;
    int v;
    int i;
    double total=0;
    //Datos de entrada
    System.out.print("Cantidad de monedas de 10 : ");
    d=leer.nextInt();
    System.out.print("Cantidad de monedas de 5 : ");
    c=leer.nextInt();
    System.out.print("Cantidad de monedas de 1: ");
    u=leer.nextInt();
    System.out.print("Cantidad de billetes de 10: ");
    z=leer.nextInt();
    System.out.print("Cantida de billetes de 20: ");
    v=leer.nextInt();
    System.out.print("Cantida de billetes de 50: ");
    i=leer.nextInt();  
    total=d*0.1+c*5+u*1+z*10+v*20+i*50;
      System.out.println("Total a pagar: "+total);
      }
    }