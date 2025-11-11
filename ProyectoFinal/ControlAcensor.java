package ProyectoFinal;

public class ControlAcensor {
    
    /**
     * Instancia del ascensor que se está controlando.
     * Contiene información sobre piso actual, capacidad, estado, etc.
     */
    private final Ascensor ascensor;
    
    /**
     * Instancia de la puerta del ascensor.
     * Controla la apertura y cierre, y detecta obstáculos.
     */
    private final Puerta puerta;
    
    /**
     * Array de botones internos del ascensor.
     * Cada botón corresponde a un piso (índice 0 = piso 1, índice 1 = piso 2, etc.)
     * Permite que los usuarios dentro del ascensor seleccionen su piso destino.
     */
    private final BotonAcensor[] botonesInternos;
    
    /**
     * Constructor de la clase ControlAcensor.
     * Inicializa el ascensor con valores por defecto (pisos 1-10, capacidad 8 personas),
     * crea la puerta y genera los 10 botones internos del ascensor.
     */
    public ControlAcensor() {
        this.ascensor = new Ascensor();
        this.puerta = new Puerta();
        
        // Crear botones internos para cada piso (1 al 10)
        this.botonesInternos = new BotonAcensor[10];
        for (int i = 0; i < 10; i++) {
            botonesInternos[i] = new BotonAcensor("Ir al piso " + (i + 1), i + 1);
        }
    }

    /**
     * Mueve el ascensor al piso especificado.
     * 
     * Proceso:
     * 1. Valida que el piso sea válido (entre pisoMinimo y pisoMaximo)
     * 2. Presiona e ilumina el botón interno correspondiente
     * 3. Cierra la puerta si está abierta
     * 4. Determina la dirección (subiendo/bajando)
     * 5. Simula el movimiento piso por piso con delays de 1 segundo
     * 6. Al llegar, apaga el botón y abre la puerta
     * 
     * @param pisoDestino El número del piso al que se desea ir (1-10)
     */
    public void moverApiso(int pisoDestino) {
        // Validar que el piso esté dentro del rango permitido
        if (!validarPiso(pisoDestino)) {
            System.out.println("ERROR: Piso invalido. Debe estar entre " +
                    ascensor.getpisoMinimo() + " y " + ascensor.getpisoMaximo());
            return;
        }
        
        // Presionar el botón interno correspondiente al piso destino
        BotonAcensor botonPresionado = botonesInternos[pisoDestino - 1];
        botonPresionado.presionar();
        botonPresionado.iluminar();
        botonPresionado.funcionalidad("Ir al piso " + pisoDestino);
        
        // Cerrar la puerta si está abierta antes de moverse
        if (puerta.getpuertaAbierta()) {
            puerta.cerrarPuerta();
        }

        // Verificar si ya está en el piso destino
        if (pisoDestino == ascensor.getpisoActual()) {
            System.out.println("Ya estas en el piso " + ascensor.getpisoActual());
            botonPresionado.apagar();
            return;
        }

        // Determinar la dirección del movimiento
        if (pisoDestino > ascensor.getpisoActual()) {
            ascensor.setEstado("Subiendo");
        } else {
            ascensor.setEstado("Bajando");
        }
        
        // Simular movimiento piso por piso
        System.out.println("\n" + ascensor.getEstado() + " Desde piso " +
                ascensor.getpisoActual() + " hacia piso " + pisoDestino);

        // Ciclo que mueve el ascensor piso por piso hasta llegar al destino
        while (ascensor.getpisoActual() != pisoDestino) {
            try {
                Thread.sleep(1000); // Pausa de 1 segundo para simular tiempo de movimiento
                
                // Incrementar o decrementar el piso según la dirección
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
        
        // Detener el ascensor al llegar al piso destino
        ascensor.setEstado("Detenido");
        
        // Apagar el botón cuando se llega al piso (cancelar iluminación)
        botonPresionado.apagar();
        botonPresionado.setpresionar(false);
        
        // Confirmar llegada y abrir puerta
        System.out.println("Has llegado a tu destino. Estas en el piso " + ascensor.getpisoActual());
        if (ascensor.getEstado().equalsIgnoreCase("Detenido")) {
            puerta.abrirPuerta();
            System.out.println("Estas en el piso " + ascensor.getpisoActual());
        } else {
            System.out.println("No se puede abrir la puerta mientras el ascensor este en movimiento");
        }
    }

    /**
     * Valida si un número de piso está dentro del rango permitido.
     * 
     * @param piso El número de piso a validar
     * @return true si el piso está entre pisoMinimo y pisoMaximo, false en caso contrario
     */
    public boolean validarPiso(int piso) {
        return piso >= ascensor.getpisoMinimo() && piso <= ascensor.getpisoMaximo();
    }

    /**
     * Permite que personas entren al ascensor.
     * 
     * Verifica:
     * - Que la puerta esté abierta (si no, la abre)
     * - Que no se exceda la capacidad máxima del ascensor
     * 
     * @param cantidadDepersona Número de personas que desean entrar
     * @return true si las personas pudieron entrar, false si se excede la capacidad
     */
    public boolean entrarPersonas(int cantidadDepersona) {
        // Asegurar que la puerta esté abierta para que entren personas
        if (!puerta.getpuertaAbierta()) {
            puerta.abrirPuerta();
        }
        
        // Validar que no se exceda la capacidad máxima
        if (ascensor.getPersonasDentro() + cantidadDepersona > ascensor.getCapacidadMaxima()) {
            System.out.println("Alerta:Capcidad exedidda.Solo caben " +
                    ascensor.getCapacidadMaxima() + " personas ");
            return false;
        }
        
        // Incrementar el contador de personas dentro del ascensor
        ascensor.setPersonasDentro(ascensor.getPersonasDentro() + cantidadDepersona);
        System.out.println(cantidadDepersona + " personas entraron. Total: " + ascensor.getPersonasDentro());
        return true;
    }

    /**
     * Permite que personas salgan del ascensor.
     * 
     * Verifica:
     * - Que la puerta esté abierta (si no, la abre)
     * - Que no intenten salir más personas de las que hay dentro
     * 
     * @param cantidadDepersona Número de personas que desean salir
     * @return true si las personas pudieron salir, false si la cantidad excede las personas dentro
     */
    public boolean salirPersonas(int cantidadDepersona) {
        // Asegurar que la puerta esté abierta para que salgan personas
        if (!puerta.getpuertaAbierta()) {
            puerta.abrirPuerta();
        }
        
        // Validar que no intenten salir más personas de las que hay
        if (cantidadDepersona > ascensor.getPersonasDentro()) {
            System.out.println("Error:Solo hay " +
                    ascensor.getPersonasDentro() + " personas  dentro ");
            return false;
        }
        
        // Decrementar el contador de personas dentro del ascensor
        ascensor.setPersonasDentro(ascensor.getPersonasDentro() - cantidadDepersona);
        System.out.println(cantidadDepersona + " personas salieron. Total: " + ascensor.getPersonasDentro());
        return true;
    }

    /**
     * Muestra en consola el estado actual completo del ascensor.
     * 
     * Información mostrada:
     * - Piso actual
     * - Estado (Subiendo, Bajando, Detenido)
     * - Estado de la puerta (Abierta o Cerrada)
     * - Número de personas dentro / capacidad máxima
     */
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
     * Activa el protocolo de emergencia.
     * 
     * Acciones:
     * - Detiene inmediatamente el ascensor en el piso actual
     * - Cambia el estado a "DETENIDO"
     * - Abre la puerta automáticamente para permitir la salida
     * - Simula notificación al equipo de mantenimiento
     * 
     * Se usa cuando hay una falla en el sistema o cuando un usuario
     * presiona el botón de emergencia.
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
    
    /**
     * Simula una emergencia durante el movimiento del ascensor.
     * 
     * El ascensor se mueve hacia el piso destino pero sufre una falla
     * antes de llegar, deteniéndose en el piso donde ocurrió el problema.
     * 
     * @param pisoDestino El piso al que se dirigía antes de la emergencia
     */
    public void emergencia(int pisoDestino) {
        // Simular movimiento hacia el piso destino
        System.out.println("\n" + ascensor.getEstado() + " Desde piso " +
                ascensor.getpisoActual() + " hacia piso " + pisoDestino);

        // Simular movimiento parcial antes de la falla
        for (int i = 0; i < pisoDestino - 1; i++) {
            try {
                Thread.sleep(1000); // Simula el tiempo de movimiento
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
        
        // Activar protocolo de emergencia
        System.out.println("\n*** EMERGENCIA ACTIVADA ***");
        System.out.println("Emergencia: el ascensor sufrio una falla mantega la calma ");
        System.out.println("Ascensor detenido en piso " + ascensor.getpisoActual());
        System.out.println("Ayuda en camino...");
        System.out.println("Estan trabajando el problema...");
        System.out.println("Problema solucionado");
    }
    
 
   
}
