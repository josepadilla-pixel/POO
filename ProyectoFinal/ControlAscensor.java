package ProyectoFinal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que controla todo el sistema del ascensor
 * Única clase con acceso a la creación y gestión de botones
 * 
 */
public class ControlAscensor {
    
    private final Ascensor ascensor;
    private final Puerta puertaAscensor;
    private final Boton[] botonesInternos;
    private final List<Piso> pisos;
    private final List<BotonPiso> botonesExternos;
    
    /**
     * Constructor del controlador del ascensor
     * Inicializa todos los componentes del sistema
     */
    public ControlAscensor() {
        this.ascensor = new Ascensor();
        this.puertaAscensor = new Puerta();
        this.pisos = new ArrayList<>();
        this.botonesExternos = new ArrayList<>();
        
        // Crear pisos del edificio
        inicializarPisos();
        
        // Crear botones internos para cada piso (1 al 10)
        this.botonesInternos = new Boton[10];
        for (int i = 0; i < 10; i++) {
            botonesInternos[i] = new BotonAcensor("Ir al piso " + (i + 1), i + 1);
        }
        
        // Crear botones externos para cada piso
        inicializarBotonesExternos();
    }

    /**
     * Inicializa los pisos del edificio
     */
    private void inicializarPisos() {
        // Primer piso
        pisos.add(new Piso(1, true, false));
        
        // Pisos intermedios (2-9)
        for (int i = 2; i <= 9; i++) {
            pisos.add(new Piso(i));
        }
        
        // Último piso
        pisos.add(new Piso(10, false, true));
    }

    /**
     * Inicializa los botones externos de cada piso
     */
    private void inicializarBotonesExternos() {
        for (Piso piso : pisos) {
            int numeroPiso = piso.getNumeroPiso();
            
            // Solo crear botón de subida si no es el último piso
            if (!piso.esUltimoPiso()) {
                String funcionSubida = "Solicitar ascensor para subir desde piso " + numeroPiso;
                BotonPiso botonSubida = new BotonPiso(numeroPiso, funcionSubida, "arriba");
                botonesExternos.add(botonSubida);
            }
            
            // Solo crear botón de bajada si no es el primer piso
            if (!piso.esPrimerPiso()) {
                String funcionBajada = "Solicitar ascensor para bajar desde piso " + numeroPiso;
                BotonPiso botonBajada = new BotonPiso(numeroPiso, funcionBajada, "abajo");
                botonesExternos.add(botonBajada);
            }
        }
    }

    /**
     * Mueve el ascensor al piso destino especificado
     * @param pisoDestino Número del piso al que se desea ir (1-10)
     */
    public void moverAPiso(int pisoDestino) {
        if (!validarPiso(pisoDestino)) {
            System.out.println("ERROR: Piso inválido. Debe estar entre " +
                    ascensor.getPisoMinimo() + " y " + ascensor.getPisoMaximo());
            return;
        }
        
        // Usar botón interno correspondiente al piso destino
        Boton botonPresionado = botonesInternos[pisoDestino - 1];
        presionarBoton(botonPresionado);
        
        // Cerrar la puerta si está abierta antes de moverse
        if (puertaAscensor.getPuertaAbierta()) {
            puertaAscensor.cerrarPuerta();
        }

        // Verificar si ya está en el piso destino
        if (pisoDestino == ascensor.getPisoActual()) {
            System.out.println("Ya estás en el piso " + ascensor.getPisoActual());
            botonPresionado.apagar();
            return;
        }

        // Determinar la dirección del movimiento
        if (pisoDestino > ascensor.getPisoActual()) {
            ascensor.setEstado("Subiendo");
        } else {
            ascensor.setEstado("Bajando");
        }
        
        System.out.println("\n" + ascensor.getEstado() + " desde piso " +
                ascensor.getPisoActual() + " hacia piso " + pisoDestino);

        // Simular movimiento piso por piso
        while (ascensor.getPisoActual() != pisoDestino) {
            try {
                Thread.sleep(1000);
                
                if (ascensor.getEstado().equals("Subiendo")) {
                    ascensor.setPisoActual(ascensor.getPisoActual() + 1);
                } else {
                    ascensor.setPisoActual(ascensor.getPisoActual() - 1);
                }
                System.out.println("Pasando por piso " + ascensor.getPisoActual() + "....");
            } catch (InterruptedException error) {
                System.out.println("Alerta: Actividad interrumpida");
            }
        }
        
        // Detener el ascensor al llegar al piso destino
        ascensor.setEstado("Detenido");
        botonPresionado.apagar();
        botonPresionado.setPresionado(false);
        
        System.out.println("Has llegado a tu destino. Estás en el piso " + ascensor.getPisoActual());
        if (ascensor.getEstado().equalsIgnoreCase("Detenido")) {
            puertaAscensor.abrirPuerta();
            System.out.println("Estás en el piso " + ascensor.getPisoActual());
        } else {
            System.out.println("No se puede abrir la puerta mientras el ascensor esté en movimiento");
        }
    }

    /**
     * Simula la presión de un botón externo (desde un piso)
     * @param numeroPiso Número del piso donde se presiona el botón
     * @param direccion Dirección solicitada ("arriba" o "abajo")
     */
    public void solicitarAscensor(int numeroPiso, String direccion) {
        if (!validarPiso(numeroPiso)) {
            System.out.println("ERROR: Piso inválido");
            return;
        }

        // Buscar el botón externo correspondiente
        BotonPiso botonExterno = buscarBotonExterno(numeroPiso, direccion);
        if (botonExterno != null) {
            presionarBoton(botonExterno);
            System.out.println("Ascensor solicitado para " + direccion + " desde piso " + numeroPiso);
        } else {
            System.out.println("ERROR: No existe botón de " + direccion + " en el piso " + numeroPiso);
        }
    }

    /**
     * Busca un botón externo específico
     * @param numeroPiso Número del piso
     * @param direccion Dirección del botón
     * @return Botón encontrado o null si no existe
     */
    private BotonPiso buscarBotonExterno(int numeroPiso, String direccion) {
        for (BotonPiso boton : botonesExternos) {
            if (boton.getNumeroPiso() == numeroPiso && 
                boton.getDireccion().equalsIgnoreCase(direccion)) {
                return boton;
            }
        }
        return null;
    }

    /**
     * Ejecuta el proceso completo de presionar un botón
     * @param boton Botón a presionar
     */
    private void presionarBoton(Boton boton) {
        boton.presionar();
        boton.iluminar();
        boton.ejecutarFuncionalidad();
    }

    /**
     * Valida si un número de piso está dentro del rango permitido
     * @param piso Número de piso a validar
     * @return true si el piso es válido, false en caso contrario
     */
    public boolean validarPiso(int piso) {
        return piso >= ascensor.getPisoMinimo() && piso <= ascensor.getPisoMaximo();
    }

    /**
     * Permite que personas entren al ascensor
     * @param cantidadDePersonas Número de personas que desean entrar
     * @return true si las personas pudieron entrar, false si se excede la capacidad
     */
    public boolean entrarPersonas(int cantidadDePersonas) {
        // Asegurar que la puerta esté abierta para que entren personas
        if (!puertaAscensor.getPuertaAbierta()) {
            puertaAscensor.abrirPuerta();
        }
        
        // Validar que no se exceda la capacidad máxima
        if (ascensor.getPersonasDentro() + cantidadDePersonas > ascensor.getCapacidadMaxima()) {
            System.out.println("Alerta: Capacidad excedida. Solo caben " +
                    ascensor.getCapacidadMaxima() + " personas");
            return false;
        }
        
        // Incrementar el contador de personas dentro del ascensor
        ascensor.setPersonasDentro(ascensor.getPersonasDentro() + cantidadDePersonas);
        System.out.println(cantidadDePersonas + " personas entraron. Total: " + ascensor.getPersonasDentro());
        return true;
    }

    /**
     * Permite que personas salgan del ascensor
     * @param cantidadDePersonas Número de personas que desean salir
     * @return true si las personas pudieron salir, false si la cantidad excede las personas dentro
     */
    public boolean salirPersonas(int cantidadDePersonas) {
        // Asegurar que la puerta esté abierta para que salgan personas
        if (!puertaAscensor.getPuertaAbierta()) {
            puertaAscensor.abrirPuerta();
        }
        
        // Validar que no intenten salir más personas de las que hay
        if (cantidadDePersonas > ascensor.getPersonasDentro()) {
            System.out.println("Error: Solo hay " +
                    ascensor.getPersonasDentro() + " personas dentro");
            return false;
        }
        
        // Decrementar el contador de personas dentro del ascensor
        ascensor.setPersonasDentro(ascensor.getPersonasDentro() - cantidadDePersonas);
        System.out.println(cantidadDePersonas + " personas salieron. Total: " + ascensor.getPersonasDentro());
        return true;
    }

    /**
     * Muestra en consola el estado actual completo del sistema
     */
    public void mostrarEstado() {
        System.out.println("\n====== ESTADO DEL SISTEMA ======");
        System.out.println("Piso actual: " + ascensor.getPisoActual());
        System.out.println("Estado: " + ascensor.getEstado());
        System.out.println("Puerta ascensor: " + (puertaAscensor.getPuertaAbierta() ? "ABIERTA" : "CERRADA"));
        System.out.println("Personas dentro: " + ascensor.getPersonasDentro() + "/" +
                ascensor.getCapacidadMaxima());
        System.out.println("Total pisos: " + pisos.size());
        System.out.println("Botones externos: " + botonesExternos.size());
        System.out.println("================================\n");
    }

    /**
     * Activa el protocolo de emergencia
     */
    public void emergencia() {
        System.out.println("\n*** EMERGENCIA ACTIVADA ***");
        ascensor.setEstado("DETENIDO");
        System.out.println("Ascensor detenido en piso " + ascensor.getPisoActual());
        System.out.println("Ayuda en camino...");
        puertaAscensor.abrirPuerta();
        System.out.println("Problema solucionado");
    }

    // Getters para acceso controlado

    /**
     * @return Lista de pisos del edificio
     */
    public List<Piso> getPisos() {
        return new ArrayList<>(pisos); // Retorna copia para proteger encapsulamiento
    }

    /**
     * @return Lista de botones externos
     */
    public List<BotonPiso> getBotonesExternos() {
        return new ArrayList<>(botonesExternos); // Retorna copia para proteger encapsulamiento
    }
}
