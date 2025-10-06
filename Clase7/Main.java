package Clase7;

public class Main {
    public static void main(String[] args) {
        // Crear objeto persona
     
       Persona p1 = new Persona(1150935002, "Jose", "Padilla", 15, 1.70, 60);
       System.out.println(p1.toString());
    
     
         System.out.println("Nombre: " + p1.getnombres());
        System.out.println("Edad: " + p1.getedad()); 

        p1.caminar();
        p1.comer();
        System.out.println(p1.estudiar("Ingeniería de Sistemas"));











    }  




}

