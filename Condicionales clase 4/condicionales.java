
public class condicionales {
  public static void main(String[] args) {
    int angulo = 80;
    if (angulo == 90) {
      System.out.println("El ángulo es un ángulo recto");
    } else {
      System.out.println("El ángulo no es un ángulo recto");
    }
    // ----------------------------------
    double temperatura = 80;
    if (temperatura > 100) {
      System.out.println("Por encima del punto de ebullición del agua");
    } else {
      System.out.println("Por debajo del punto de ebullición del agua");
    }
    // ----------------------------------
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
    // ----------------------------------
    int x = 20;
    int y = 10;
    int z = 12;
    if (x > y && z < 20) {
      int p = 50;
      System.out.println("valor de p" + p);
    }
    // ----------------------------------
    int distancia = 20;
    if (distancia > 20 && distancia < 35) {
      int tiempo = 10;
      System.out.println("tiempo es:" + tiempo);
    }
    // condicionales adinados
    /*
     * Ejercicio 4.9: Un ángulo se considera agudo si es menor de 90
     * grados, obtuso si es mayor de 90 grados y recto si
     * es igual a 90 grados. Utilizando esta información,
     * escribir un algoritmo que acepte un ángulo en grados
     * y visualice el tipo de ángulo correspondiente a los
     * grados introducidos.
     * Entrada:angulo
     * proceso:validar si el angulo esta en los siguientes rangos menor que 90,mayor y igual 
     * salida:si es menor que 90 mostrar es un angulo agudo,si es mayo mostrar el angulo es obtuso, si es igual es un angulo recto
     */
    int a = 20; 
    if (a<90){
      System.out.println("Angulo eso agudo ");
    }else if(a>90){
      System.out.println("Angulo es obtuso");
    }else{
      System.out.println("Angulo es recto");
    }
   //--------------------------------------
   //ejercicio 4.2 
   int num1 = 10; 
   int num2 = 20;
   if (num1>num2){
    System.out.println("El primer numero es el mayor");
   }else if(num1<num2){
    System.out.println("el primer numero es el mas pequeño");
   }else{
    System.out.println("Ambos numeros son iguales");
   } 
   //--------------------------------------
   // ejercicio 4.3
   int nu1 = 15;
   int nu2 = 20;
   int nu3 = 10;
   if((nu1 > nu2 && nu1 < nu3) || (nu1 > nu3 && nu1 < nu2)){
    System.out.println("El numero central es:"+ nu1);
   }else if ((nu2 > nu1 && nu2 < nu3) || (nu2 > nu3 && nu2 < nu1)){
     System.out.println("El numero central es:"+ nu2);
   }else{
     System.out.println("El numero central es:"+ nu3);
   }
  //--------------------------------------
   // ejercicio 4.4
   int numero = 25; 
   if(numero>=0){
    double raiz = Math.sqrt(numero);
    System.out.println("La raiz cuadrada es:"+raiz);
   }else{
    System.out.println("No se puede calcular raiz cuadrada de un numero negativo");
   }
  // ejercicio 4.5
  

























 
  }
}
