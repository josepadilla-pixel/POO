package ProyectoFinal;

public class ControlAcensor {
    private final Ascensor ascensor = new Ascensor();
    private final Puerta puerta = new Puerta();

    public ControlAcensor() {
        
    }

    public void moverApiso(int pisoDestino) {
        if (!validarPiso(pisoDestino)) {
            System.out.println("ERROR: Piso invalido. Debe estar entre " +
                    ascensor.getpisoMinimo() + " y " + ascensor.getpisoMaximo());
            return;
        }
        if (puerta.getpuertaAbierta()) {
            puerta.cerrarPuerta();
        }

        if (pisoDestino == ascensor.getpisoActual()) {
            System.out.println("Ya estas en el piso " + ascensor.getpisoActual());
        }

        if (pisoDestino > ascensor.getpisoActual()) {
            ascensor.setEstado("Subiendo");
        } else if (pisoDestino == ascensor.getpisoActual()) {
            ascensor.setEstado("Ya estas en ese piso");
        } else {
            ascensor.setEstado("Bajando");
        }
        // simular movimiento

        System.out.println("\n" + ascensor.getEstado() + " Desde piso " +
                ascensor.getpisoActual() + " hacia piso " + pisoDestino);

        while (ascensor.getpisoActual() != pisoDestino) {
            try {
                Thread.sleep(1000);// simula el tiempo de movimiento
                if (ascensor.getEstado().equals("Subiendo")) {
                    ascensor.setpisoActual(ascensor.getpisoActual() + 1);
                } else {
                    ascensor.setpisoActual(ascensor.getpisoActual() - 1);
                }
                System.out.println(" Pasando por piso " + ascensor.getpisoActual() + "....");
            } catch (InterruptedException error) {
                System.out.println("Alerta:Actividad interrupitada");
            }

        }
        ascensor.setEstado("Detenido");
        System.out.println("Has llegado a tu destino. Estas en el piso " + ascensor.getpisoActual());
        if (ascensor.getEstado().equalsIgnoreCase("Detenido")) {
            puerta.abrirPuerta();
            System.out.println("Estas en el piso " + ascensor.getpisoActual());
        } else {
            System.out.println("No se puede abrir la puerta mientras el ascensor este en movimiento");
        }

    }

    public boolean validarPiso(int piso) {
        return piso >= ascensor.getpisoMinimo() && piso <= ascensor.getpisoMaximo();
    }

    public boolean entrarPersonas(int cantidadDepersona) {
        if (!puerta.getpuertaAbierta()) {
            puerta.abrirPuerta();
        }
        if (ascensor.getPersonasDentro() + cantidadDepersona > ascensor.getCapacidadMaxima()) {
            System.out.println("Alerta:Capcidad exedidda.Solo caben " +
                    ascensor.getCapacidadMaxima() + " personas ");
            return false;
        }
        ascensor.setPersonasDentro(ascensor.getPersonasDentro() + cantidadDepersona);
        System.out.println(cantidadDepersona + " personas entraron. Total: " + ascensor.getPersonasDentro());
        return true;

    }

    public boolean salirPersonas(int cantidadDepersona) {
        if (!puerta.getpuertaAbierta()) {
            puerta.abrirPuerta();
        }
        if (cantidadDepersona > ascensor.getPersonasDentro()) {
            System.out.println("Error:Solo hay " +
                    ascensor.getPersonasDentro() + " personas  dentro ");
            return false;
        }
        ascensor.setPersonasDentro(ascensor.getPersonasDentro() - cantidadDepersona);
        System.out.println(cantidadDepersona + " personas salieron. Total: " + ascensor.getPersonasDentro());
        return true;
    }

    public void mostraestado() {
        System.out.println("\n======ESTADO DEL ASCENSOR======");
        System.out.println("Piso actual: " + ascensor.getpisoActual());
        System.out.println("Estado: " + ascensor.getEstado());
        System.out.println("Puerta: " + (puerta.getpuertaAbierta() ? "ABIERTA" : "CERRADA"));
        System.out.println("Personas dentro: " + ascensor.getPersonasDentro() + "/" +
                ascensor.getCapacidadMaxima());
        System.out.println("=========================================\n");

    }

    /**
     * Llamada de emergencia
     */
    public void emergencia() {
        System.out.println("\n*** EMERGENCIA ACTIVADA ***");
        ascensor.setEstado("DETENIDO");
        System.out.println("Ascensor detenido en piso " + ascensor.getpisoActual());
        System.out.println("Ayuda en camino...");
        System.out.println("Estan trabajando el problema...");
        puerta.abrirPuerta();
        System.out.println("Problema solucionado");
    } 
    public void emergencia(int pisoDestino ){
        // simular movimiento

        System.out.println("\n" + ascensor.getEstado() + " Desde piso " +
                ascensor.getpisoActual() + " hacia piso " + pisoDestino);

        
        for (int i = 0; i <pisoDestino -1 ; i++) {
            try {
                Thread.sleep(1000);// simula el tiempo de movimiento
                if (ascensor.getEstado().equals("Subiendo")) {
                    ascensor.setpisoActual(ascensor.getpisoActual() + 1);
                } else {
                    ascensor.setpisoActual(ascensor.getpisoActual() - 1);
                }
                System.out.println(" Pasando por piso " + ascensor.getpisoActual() + "....");
            } catch (InterruptedException error) {
                System.out.println("Alerta:Actividad interrupitada");
            }
        }
        System.out.println("\n*** EMERGENCIA ACTIVADA ***");
        System.out.println("Emergencia: el ascensor sufrio una falla mantega la calma ");
         System.out.println("Ascensor detenido en piso " + ascensor.getpisoActual());
        System.out.println("Ayuda en camino...");
        System.out.println("Estan trabajando el problema...");
        System.out.println("Problema solucionado");

        
    }

}
