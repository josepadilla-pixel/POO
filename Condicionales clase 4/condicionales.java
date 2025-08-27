
public class condicionales {
  public static void main(String[] args) {
    int angulo = 80;
    if (angulo == 90) {
      System.out.println("El ángulo es un ángulo recto");
    } else {
      System.out.println("El ángulo no es un ángulo recto");
    }
    //----------------------------------
    double temperatura = 80;
    if (temperatura > 100) {
      System.out.println("Por encima del punto de ebullición del agua");
    } else {
      System.out.println("Por debajo del punto de ebullición del agua");
    }
     //----------------------------------
    int num = -7;
    int totalnumposito = 0;
    int totalnumnegativos = 0;

    if (num > 0) {
      totalnumposito += num;
    } else {
      totalnumnegativos += num;
    }
    System.out.println(totalnumnegativos);
    System.out.println(totalnumposito);
    //----------------------------------
    int x = 20;
    int y = 10;
    int z = 12;
    if (x > y && z < 20) {
      int p = 50;
      System.out.println("valor de p" + p);
    }
    //----------------------------------
    int distancia = 20;
    if (distancia > 20 && distancia < 35) {
      int tiempo = 10;
      System.out.println("tiempo es:" + tiempo);
    }

  }
}
