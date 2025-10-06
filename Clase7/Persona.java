package Clase7;

public class Persona {
    //Atributos
    public int identificacion;
    public String nombres;
    public String apellidos;
    public int edad;
    public double estatura;
    public double peso;


    //Metodo constructor de la Clase se reconoce ´pr que el mismo nomvre de la clase
    //El constructor de la clase me permite inicializar la clase
    //La palabra reservada "this"se utiliza para autoreferenciar el atributo de laclase
    public Persona(int identificacion, String nombres, String apellidos,int edad, double estatura,double peso){
     this.identificacion= identificacion;
     this.nombres = nombres; 
     this.apellidos = apellidos;
     this.edad = edad;
     this.estatura = estatura;
     this.peso = peso;
    }


    //Metodos 
    public void caminar(){
        System.out.println("caminar");
    }     
    public boolean jugar(){
     return true;
    }
    public void comer(){
        System.out.println("comiendo");
    }
    public String estudiar(String carrera){
        return "Usted esta estudiando:" + carrera;
    }
    // Metodo get 
    public int getidentificacion() {
        return identificacion;
    }
    public int getnombres() {
        return identificacion;
    }
    public int getapellidos() {
        return identificacion;
    }
    public int getedad() {
        return identificacion;
    } 
    public int getestructura() {
        return identificacion;
    } 
    public int getpeso() {
        return identificacion;
    } 
    //metodo set 
       public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
     public void setnombres(String nombres) {
        this.nombres = nombres;
    }
      public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    } 
      public void setEdad(int edad) {
        this.edad = edad;
    }
     public void setestatura(double estatura) {
        this.estatura = estatura;
    } 
      public void setpeso(double peso) {
        this.peso = peso;
    }


    // consultar sobre el metodo toString
      public String toString() {
    return "Persona {" +
                "\nIdentificación = " + identificacion +
                "\nNombres = '" + nombres + '\'' +
                "\nApellidos = '" + apellidos + '\'' +
                "\nEdad = " + edad +
                "\nEstatura = " + estatura +
                "\nPeso = " + peso +
                "\n}";

    }



































}
