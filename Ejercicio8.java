import java.util.Scanner;
public class Ejercicio8 {
  public static void main(String[]args) {
    //definir variables
    Scanner leer=new Scanner(System.in);
    int m;
    int p;
    int v;
    int b;
    double dinero=0;
    //Datos de entrada
    System.out.print("Cantidad de monedas: ");
    m=leer.nextInt();
    System.out.print("Cantidad de billetes: ");
    p=leer.nextInt();
    System.out.print("Valor de las monedas: ");
    v=leer.nextInt();
    System.out.print("Valor de los billetes: ");
    b=leer.nextInt();
    if (v>=10){
    dinero=m*(v/100)+b*p;
    }if (v<=9){
    dinero=v*m+b*p;}
      System.out.println("Total a pagar: "+dinero);
      }
    }