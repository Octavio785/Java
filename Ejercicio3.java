public class Ejercicio3 {
  public static void main(String[]args) {
    //definir variables
    int i=3;
    int a=1;
    //Datos de entrada
    do{
    System.out.print(i + ", ");
    i=i*3;
    a++;
    }while(a<365);
    System.out.println("ahorrara "+i);
    }
  }