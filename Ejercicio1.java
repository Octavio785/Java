public class Ejercicio1 {
  public static void main(String[]args) {
    //definir variables
    int i=1500;
    int a=1;
    //Datos de entrada
    do{
    System.out.print(i + ", ");
    i+=1500*10/100;
    a++;
    }while(a<7);
    System.out.println("Recibira "+i);
    }
  }