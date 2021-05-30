import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[]args) {
    //definir variables
    Scanner leer=new Scanner(System.in);
    int dinero;
    double suma;

 System.out.print("Dinero depositado: ");
 dinero=leer.nextInt();
  suma=dinero+dinero*0.1;
  System.out.println("Total a pagar: "+suma);
  }
}