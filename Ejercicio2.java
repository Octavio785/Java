import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[]args) {
    //definir variables
    Scanner leer=new Scanner(System.in);
    int simples;
    int dobles;
    int triples;
    int suma;
    double paga=0;

 System.out.print("Numero de simples: ");
 simples=leer.nextInt();
 System.out.print("Numero de dobles: ");
 dobles=leer.nextInt();
 System.out.print("Numero de triples: ");
  triples=leer.nextInt();
  suma=simples*20+dobles*25+triples*28;
  paga=suma+suma*0.05;
  System.out.println("Total a pagar: "+paga);
  }
}