package ProyectoFinal;

public class EJcutadorAscensor {

    public static void main(String[] args) {
        ControlAcensor control = new ControlAcensor(); 
        control.mostraestado(); 

        System.out.println("\n=== Primer escenario: Subir al piso 6 ==="); 
        control.entrarPersonas(7); 
        control.moverApiso(6); 
        control.salirPersonas(2); 

        System.out.println("\n=== Segundo escenario: Bajar al piso 2 ===");
        control.entrarPersonas(3);
        control.moverApiso(4);
        control.salirPersonas(6); 

        System.out.println("\n=== Tercer escenario: Prueba de errores ===");
        control.moverApiso(15); 
        control.entrarPersonas(2);
        control.moverApiso(-20); 

        System.out.println("\n=== Cuarto escenario: Prueba del sistema de emergencia ===");
        control.emergencia(2); 
    }
}

