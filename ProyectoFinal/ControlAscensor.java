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
    private final List<Piso> pisos;
    private final List<Boton> botones;

    /**
     * Constructor del controlador del ascensor
     * Inicializa todos los componentes del sistema
     */
    public ControlAscensor() {
        this.ascensor = new Ascensor();
        this.pisos = new ArrayList<>();
        this.botones = new ArrayList<>();

        // Crear pisos y botones
        inicializarPisos();
        inicializarBotones();
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
     * Inicializa todos los botones del sistema (internos y externos)
     */
    private void inicializarBotones() {
        // Crear botones internos para cada piso (1 al 10)
        for (int i = 1; i <= 10; i++) {
            botones.add(new BotonAcensor("ir al piso "+i, i));
        }

        // Crear botones externos para cada piso
        for (Piso piso : pisos) {
            int numeroPiso = piso.getNumeroPiso();

            // Solo crear botón de subida si no es el último piso
            if (!piso.esUltimoPiso()) {
                String funcionSubida = "Solicitar ascensor para subir desde piso " + numeroPiso;
                BotonPiso botonSubida = new BotonPiso(numeroPiso, funcionSubida, "arriba");
                botones.add(botonSubida);
            }

            // Solo crear botón de bajada si no es el primer piso
            if (!piso.esPrimerPiso()) {
                String funcionBajada = "Solicitar ascensor para bajar desde piso " + numeroPiso;
                BotonPiso botonBajada = new BotonPiso(numeroPiso, funcionBajada, "abajo");
                botones.add(botonBajada);
            }
        }
    }

    /**
     * Mueve el ascensor al piso destino especificado.
     * Ahora delega la lógica de movimiento al propio ascensor.
     * 
     * @param pisoDestino Número del piso al que se desea ir (1-10)
     */
    public void moverAPiso(int pisoDestino) {
        if (!validarPiso(pisoDestino)) {
            System.out.println("ERROR: Piso inválido. Debe estar entre " +
                    ascensor.getPisoMinimo() + " y " + ascensor.getPisoMaximo());
            return;
        }

        Boton botonInterno = buscarBotonInterno(pisoDestino);
        // En tal caso que el usiario no diga un piso destinado 
        if (botonInterno == null) {
            System.out.println("ERROR: No se encontró el botón para el piso " + pisoDestino);
            return;
        }

        presionarBoton(botonInterno);

        // Delega la responsabilidad de moverse al ascensor
        ascensor.moverA(pisoDestino);

        // Apaga el botón después de completar el viaje
        botonInterno.apagar();
        botonInterno.setPresionado(false);
    }

    /**
     * Simula la presión de un botón externo (desde un piso)
     * 
     * @param numeroPiso Número del piso donde se presiona el botón
     * @param direccion  Dirección solicitada ("arriba" o "abajo")
     */
    public void solicitarAscensor(int numeroPiso, String direccion) {
        if (!validarPiso(numeroPiso)) {
            System.out.println("ERROR: Piso inválido");
            return;
        }

        Boton botonExterno = buscarBotonExterno(numeroPiso, direccion);
        if (botonExterno != null) {
            presionarBoton(botonExterno);
            System.out.println("Ascensor solicitado para " + direccion + " desde piso " + numeroPiso);
            // Aquí se podría añadir lógica para que el ascensor atienda la llamada
        } else {
            //Otra medida de seguridad por si el usuario solicita mal
            System.out.println("ERROR: No existe botón de " + direccion + " en el piso " + numeroPiso);
        }
    }

    /**
     * Busca un botón interno específico por el número de piso.
     * 
     * @param numeroPiso El número de piso del botón a buscar.
     * @return El botón encontrado o null si no existe.
     */
    private Boton buscarBotonInterno(int numeroPiso) {
        for (Boton boton : botones) {
            if (boton.esBoton(numeroPiso, null) ) {
                return boton;
            }
        }
        return null;
    }

    /**
     * Busca un botón externo específico
     * 
     * @param numeroPiso Número del piso
     * @param direccion  Dirección del botón
     * @return Botón encontrado o null si no existe
     */
    private Boton buscarBotonExterno(int numeroPiso, String direccion) {
        for (Boton boton : botones) {
            if (boton.esBoton(numeroPiso, direccion)) {
                return boton;
            }
        }
        return null;
    }

    /**
     * Ejecuta el proceso completo de presionar un botón
     * 
     * @param boton Botón a presionar
     */
    private void presionarBoton(Boton boton) {
        boton.presionar();
        boton.iluminar();
        boton.ejecutarFuncionalidad();
    }

    /**
     * Valida si un número de piso está dentro del rango permitido
     * 
     * @param piso Número de piso a validar
     * @return true si el piso es válido, false en caso contrario
     */
    public boolean validarPiso(int piso) {
        return piso >= ascensor.getPisoMinimo() && piso <= ascensor.getPisoMaximo();
    }

    /**
     * Permite que personas entren al ascensor.
     * Delega la lógica al ascensor.
     * 
     * @param cantidadDePersonasAEntrar Número de personas que desean entrar
     * @return true si las personas pudieron entrar, false si se excede la capacidad
     */
    public boolean entrarPersonas(int cantidadDePersonasAEntrar) {
        return ascensor.entrarPersonas(cantidadDePersonasAEntrar);
    }

    /**
     * Permite que personas salgan del ascensor.
     * Delega la lógica al ascensor.
     * 
     * @param cantidadDePersonasASalir Número de personas que desean salir
     * @return true si las personas pudieron salir, false si la cantidad excede las
     *         personas dentro
     */
    public boolean salirPersonas(int cantidadDePersonasASalir) {
        return ascensor.salirPersonas(cantidadDePersonasASalir);
    }

    /**
     * Muestra en consola el estado actual completo del sistema
     */
    public void mostrarEstado() {
        System.out.println("\n====== ESTADO DEL SISTEMA ======");
        System.out.println("Piso actual: " + ascensor.getPisoActual());
        System.out.println("Estado: " + ascensor.getEstado());
        System.out.println("Puerta ascensor: " + (ascensor.getPuerta().getPuertaAbierta() ? "ABIERTA" : "CERRADA"));
        System.out.println("Personas dentro: " + ascensor.getPersonasDentro() + "/" +
                ascensor.getCapacidadMaxima());
        System.out.println("Total pisos: " + pisos.size());
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
        ascensor.getPuerta().abrirPuerta();
        System.out.println("Problema solucionado");
    }

    

}
