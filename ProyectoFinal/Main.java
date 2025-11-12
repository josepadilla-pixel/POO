package ProyectoFinal;

/**
 * Clase principal que demuestra el funcionamiento del sistema de ascensor
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        ControlAscensor control = new ControlAscensor(); 
        control.mostrarEstado(); 

        System.out.println("\n=== Escenario 1: Solicitud externa + movimiento interno ===");
        control.solicitarAscensor(3, "arriba"); // Solicitud desde piso 3 para subir
        control.entrarPersonas(4); 
        control.moverAPiso(7); 
        control.salirPersonas(2); 

        System.out.println("\n=== Escenario 2: Múltiples solicitudes ===");
        control.solicitarAscensor(1, "arriba"); // Desde primer piso (solo subida)
        control.solicitarAscensor(10, "abajo"); // Desde último piso (solo bajada)
        control.solicitarAscensor(5, "arriba"); // Desde piso intermedio
        control.entrarPersonas(3);
        control.moverAPiso(2);
        control.salirPersonas(3); 

        System.out.println("\n=== Escenario 3: Prueba de errores ===");
        control.solicitarAscensor(1, "abajo"); // Error: no hay botón de bajada en piso 1
        control.solicitarAscensor(10, "arriba"); // Error: no hay botón de subida en piso 10
        control.moverAPiso(15); // Error: piso inválido

        System.out.println("\n=== Escenario 4: Sistema de emergencia ===");
        control.emergencia(); 
    } 

    
    
}

