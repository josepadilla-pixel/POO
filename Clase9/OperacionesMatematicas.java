package Clase9;

public class OperacionesMatematicas {
    
    //Atributos
    private int n1;
    private int n2;

    //Método Constructor de la clase: permite inicializar la clase
    //Tiene el mismo nombre de la clase.
    /*
     * Firma del método constructor
     * visibilidad: público
     * nombre: OperacionesMatematicas
     * Cuántos parámetros: 2
     * De que tipo son los parametros: 
     *       parametro 1 tipo entero
     *       parámetro 2 tipo entero
     */
    public OperacionesMatematicas(int n1, int n2){
        this.n1 = n1; //this significa una autoreferencia al atributo de la clase
        this.n2 = n2;
    }

    //Métodos
    public int sumar(){
        return n1 + n2;
    } 
    public int restar(){
        return n1 - n2;
    }
    public int multiplicar(){
        return n1 * n2;
    } 
    public double dividir(){
        double resultado;
        if (n2==0)
        resultado = 0.0;
        else{
            resultado = (double) n1 / (double) n2;//convertir un entero a real
        }
        return resultado;
    } 
    //potencias
    public double cuadradoN1() {
     return Math.pow(n1, 2);
    }

    public double cuadradoN2() {

     return Math.pow(n2,2);
    } 
    public double cubicoN1(){
        return Math.pow(n1, 3);
    }
    public double cubicoN2(){
        return Math.pow(n2, 3);
    } 
    public double elevadoalanN1 (int n){
        return Math.pow(n1, n);
    }
    public double elavadoalanN2(int n){
        return Math.pow(n2, n);
    } 
    //raices
    public double raizN1(){
        if(n1<0){
            System.out.println("no se puede hacer raiz cuadrada de un numero negativo");
            return 0.0;
        } 
         return Math.sqrt(n1);
    }
    public double raizN2(){
        if(n2<0){
            System.out.println("no se puede hacer raiz cuadrada de un numero negativo");
            return 0.0;
        } 
        return Math.sqrt(n2);
    } 
    public double raizcubicaN1(){
         return Math.cbrt(n1);
    } 
    public double raizcubicaN2(){
         return Math.cbrt(n2);
    } 
    public double raizN1(int n){
        if (n==0){
            System.out.println("No se puede dividir por cero en la raíz n");
            return 0.0;
        } 
        return Math.pow(n1, 1.0 / n);
 
    } 
    public double raizN2(int n){
        if (n==0){
            System.out.println("No se puede dividir por cero en la raíz n");
            return 0.0;
        } 
        return Math.pow(n2, 1.0 / n);

    }
















































































































    }


   



















