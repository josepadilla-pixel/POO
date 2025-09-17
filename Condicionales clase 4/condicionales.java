
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
     * proceso:validar si el angulo esta en los siguientes rangos menor que 90,mayor
     * y igual
     * salida:si es menor que 90 mostrar es un angulo agudo,si es mayo mostrar el
     * angulo es obtuso, si es igual es un angulo recto
     */
    int a = 20;
    if (a < 90) {
      System.out.println("Angulo eso agudo ");
    } else if (a > 90) {
      System.out.println("Angulo es obtuso");
    } else {
      System.out.println("Angulo es recto");
    }
    // --------------------------------------
    // ejercicio 4.2
    int num1 = 10;
    int num2 = 20;
    if (num1 > num2) {
      System.out.println("El primer numero es el mayor");
    } else if (num1 < num2) {
      System.out.println("el primer numero es el mas pequeño");
    } else {
      System.out.println("Ambos numeros son iguales");
    }
    // --------------------------------------
    // ejercicio 4.3
    int nu1 = 15;
    int nu2 = 20;
    int nu3 = 10;
    if ((nu1 > nu2 && nu1 < nu3) || (nu1 > nu3 && nu1 < nu2)) {
      System.out.println("El numero central es:" + nu1);
    } else if ((nu2 > nu1 && nu2 < nu3) || (nu2 > nu3 && nu2 < nu1)) {
      System.out.println("El numero central es:" + nu2);
    } else {
      System.out.println("El numero central es:" + nu3);
    }
    // --------------------------------------
    // ejercicio 4.4
    int numero = 25;
    if (numero >= 0) {
      double raiz = Math.sqrt(numero);
      System.out.println("La raiz cuadrada es:" + raiz);
    } else {
      System.out.println("No se puede calcular raiz cuadrada de un numero negativo");
    }
    // --------------------------------------//--------------------------------------
    // ejercicio 4.5
    int g = 9;
    if (g % 2 == 0) {
      System.out.println("el numero es par por medotodo de modulo");
    }
    if ((g / 2) * 2 == g) {
      System.out.println("El numero es par por metodo de division");
    }
    if ((g & 1) == 0) {
      System.out.println("El numero es par por metodo binario");
    }
    // --------------------------------------
    // ejercicio 4.6
    int dia = 2;
    int mes = 9;
    int año = 2025;
    dia++;
    if (dia > 30) {
      dia = 1;
      mes++;
    }
    if (mes > 12) {
      mes = 1;
      año++;
    }
    System.out.println("Día siguiente: " + dia + "/" + mes + "/" + año);
    // --------------------------------------
    // ejercicio 4.7
    int peso = 55;
    if(peso<40){
      System.out.println("Aluno pesa menos de 40kg");
    }else if(peso>40&&peso<50){
      System.out.println("Aluno pesa entre 40kg y 50kg");
    }else if(peso>50&&peso<60){
      System.out.println("Aluno pesa entre 50kg y 60kg");
    }else{
      System.out.println("Aluno pesa mas o igual a 60kg");
    }
    // --------------------------------------
   //ejercicio 4.8
   int k= 17;
   int l=4;
   if(k%l==0){
    System.out.println(k+"Es divisor de:"+l);
   }else if(l%k==0){
    System.out.println(l+"Es divisor de:"+k);
   }else{
    System.out.println("Ninguno es divisor del otro");
   } 
   // --------------------------------------
   //ejrcicio 4.10
   int nota=87;
   if(nota>90){
    System.out.println("Saco una letra A");
   }else if(nota>=80){
   System.out.println("Saco una letra B");
   }else if(nota>=70){
    System.out.println("Saco una letra c");
   }else if(nota>=69){
    System.out.println("Saco una letra D");
   }else{
    System.out.println("Saco una letra F");
   } 
   // --------------------------------------
   //ejercicio 4.11
   int u= 10;
   int i=5;
   int selecionOp= 3;
     if (selecionOp == 1) {
       System.out.println("Suma: " + (u + i));
     }else if(selecionOp == 2){
      System.out.println("Resta: " + (u - i));
     }else if(selecionOp == 3){
     System.out.println("Multiplicacion: " + (u * i));
     }else if(selecionOp == 4){
      System.out.println("Division: " + (u / i));
     }else{
      System.out.println("Operacion no valida");
     }
   //----------------------------------------
  //ejercicio 4.12
  double m=20;
  double n=0; 
  int codigo=3;
   if (codigo == 1){
     System.out.println("Suma: " + (m + n));
   }else if(codigo == 2){
      System.out.println("Multiplicación: " + (m * n));
   }else if (codigo == 3){
     System.out.println("División: " + (m / n));
   }else if(n != 0){
     System.out.println("No se puede dividir entre cero");
   }else{
     System.out.println("Código inválido");
   }
     
  

   
    
















































































  }
}
