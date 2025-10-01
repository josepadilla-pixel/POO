package Clase7;

public class persona {
    //Atributos
    private int identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;


    //Metodo constructor de la Clase se reconoce ´pr que el mismo nomvre de la clase
    //El constructor de la clase me permite inicializar la clase
    //La palabra reservada "this"se utiliza para autoreferenciar el atributo de laclase
    public persona(int identificacion, String nombres, String apellidos,int edad, double estatura,double peso){
     this.identificacion= identificacion;
     this.nombres = nombres; 
     this.apellidos = apellidos;
     this.edad = edad;
     this.estatura = estatura;
     this.peso = peso;
    }


    //Metodos 
    public void caminar(){}     
    public bolean jugar(){}
    public void comer(){}
    public String estudiar(){}
    
    















































}
