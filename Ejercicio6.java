import java.util.Scanner;
public class Ejercicio6 {
  public static void main(String[]args) {
    //definir variables
    Scanner leer=new Scanner(System.in);
    int i;
    //Datos de entrada
    System.out.print("numero: ");
    i=leer.nextInt();
    if (i>0){
     System.out.println("El numero es mayor que 0");
    }if (i==0){
     System.out.println("El numero es 0");
    }if (i<0){
     System.out.println("El numero es menor que 0");}
    
    }
  }