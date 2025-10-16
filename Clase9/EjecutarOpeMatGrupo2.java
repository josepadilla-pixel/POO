package Clase9;
import java.util.Scanner;

public class EjecutarOpeMatGrupo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Primer número: ");
        int a = sc.nextInt();

        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        OperacionesMatematicas objOp = new OperacionesMatematicas(a, b);

        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Cuadrado");
        System.out.println("6. Cubo");
        System.out.println("7. Potencia n");
        System.out.println("8. Raíz");
        System.out.println("9. Raíz cúbica");
        System.out.println("10. Raíz n");
        System.out.print("Opción: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Suma: " + objOp.sumar());
                break;
            case 2:
                System.out.println("Resta: " + objOp.restar());
                break;
            case 3:
                System.out.println("Multiplicación: " + objOp.multiplicar());
                break;
            case 4:
                System.out.println("División: " + objOp.dividir());
                break;
            case 5:
                System.out.println("El cuadrado del primer número es: " + objOp.cuadradoN1());
                System.out.println("El cuadrado del segundo número es: " + objOp.cuadradoN2());
                break;
            case 6:
                System.out.println("El cubo del primer número es: " + objOp.cubicoN1());
                System.out.println("El cubo del segundo número es: " + objOp.cubicoN2());
                break;
            case 7:
                System.out.print("Ingrese el exponente n: ");
                int n = sc.nextInt();
                System.out.println("El primer número elevado a n es: " + objOp.elevadoalanN1(n));
                System.out.println("El segundo número elevado a n es: " + objOp.elavadoalanN2(n));
                break;
            case 8:
                System.out.println("Raíz cuadrada del primer número: " + objOp.raizN1());
                System.out.println("Raíz cuadrada del segundo número: " + objOp.raizN2());
                break;
            case 9:
                System.out.println("Raíz cúbica del primer número: " + objOp.raizcubicaN1());
                System.out.println("Raíz cúbica del segundo número: " + objOp.raizcubicaN2());
                break;
            case 10:
                System.out.print("Ingrese el índice n para la raíz: ");
                int nRaiz = sc.nextInt();
                System.out.println("Raíz " + nRaiz + " del primer número: " + objOp.raizN1(nRaiz));
                System.out.println("Raíz " + nRaiz + " del segundo número: " + objOp.raizN2(nRaiz));
                break;
            default:
                System.out.println("Opción no válida");
                break;
        } 




        

        sc.close();
    }
}

