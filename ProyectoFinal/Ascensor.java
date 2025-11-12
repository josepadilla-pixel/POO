package ProyectoFinal;

/**
 * Clase que representa el ascensor con sus atributos y estado actual
 * Controla la posición, capacidad y movimiento del ascensor
 * 
 * 
 */
public class Ascensor {
    private int pisoActual;
    private final int pisoMinimo;
    private final int pisoMaximo;
    private final int capacidadMaxima;
    private int personasDentro;
    private String estado; // "Subiendo", "Bajando", "Detenido"
    private final Puerta puerta; // El ascensor ahora tiene su propia puerta

    /*
     * @param 
     */

    /**
     * Constructor principal del ascensor
     * 
     * @param pisoMinimo      Piso más bajo al que puede llegar el ascensor
     * @param pisoMaximo      Piso más alto al que puede llegar el ascensor
     * @param capacidadMaxima Número máximo de personas permitidas
     */
    public Ascensor(int pisoMinimo, int pisoMaximo, int capacidadMaxima) {
        this.pisoActual = pisoMinimo;
        this.pisoMinimo = pisoMinimo;
        this.pisoMaximo = pisoMaximo;
        this.capacidadMaxima = capacidadMaxima;
        this.personasDentro = 0;
        this.estado = "Detenido";
        this.puerta = new Puerta(); // Se crea la puerta con el ascensor
    }

    /**
     * Constructor por defecto del ascensor
     * Configura pisos del 1 al 10 con capacidad para 8 personas
     */
    public Ascensor() {
        this(1, 10, 8);
    }

    // Getters

    public int getPisoActual() {
        return pisoActual;
    }

    public int getPisoMinimo() {
        return pisoMinimo;
    }

    public int getPisoMaximo() {
        return pisoMaximo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPersonasDentro() {
        return personasDentro;
    }

    public String getEstado() {
        return estado;
    }

    public Puerta getPuerta() {
        return puerta;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Mueve el ascensor al piso destino.
     * Ahora esta lógica está DENTRO del ascensor.
     */
    public void moverA(int pisoDestino) {
        if (puerta.getPuertaAbierta()) {
            puerta.cerrarPuerta();
        }

        if (pisoDestino == this.pisoActual) {
            System.out.println("Ya estás en el piso " + this.pisoActual);
            this.puerta.abrirPuerta();
            return;
        }

        this.estado = (pisoDestino > this.pisoActual) ? "Subiendo" : "Bajando";
        System.out.println("\n" + this.estado + " desde piso " + this.pisoActual + " hacia piso " + pisoDestino);

        while (this.pisoActual != pisoDestino) {
            try {
                Thread.sleep(1000);
                if ("Subiendo".equals(this.estado)) {
                    this.pisoActual++;
                } else {
                    this.pisoActual--;
                }
                System.out.println("Pasando por piso " + this.pisoActual + "....");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Alerta: Actividad interrumpida");
            }
        }

        this.estado = "Detenido";
        System.out.println("Has llegado a tu destino. Estás en el piso " + this.pisoActual);
        this.puerta.abrirPuerta();
    }

    /**
     * Lógica para que entren personas.
     */
    public boolean entrarPersonas(int cantidadDePersonasAEntrar) {
        if (!puerta.getPuertaAbierta()) {
            puerta.abrirPuerta();
        }
        if (this.personasDentro + cantidadDePersonasAEntrar > this.capacidadMaxima) {
            System.out.println("Alerta: Capacidad excedida. Solo caben " +
                    this.capacidadMaxima + " personas");
            return false;
        }
        this.personasDentro += cantidadDePersonasAEntrar;
        System.out.println(cantidadDePersonasAEntrar + " personas entraron. Total: " + this.personasDentro);
        return true;
    }

    /**
     * Lógica para que salgan personas.
     */
    public boolean salirPersonas(int cantidadDePersonasASalir) {
        if (!puerta.getPuertaAbierta()) {
            puerta.abrirPuerta();
        }
        if (cantidadDePersonasASalir > this.personasDentro) {
            System.out.println("Error: Solo hay " +
                    this.personasDentro + " personas dentro");
            return false;
        }
        this.personasDentro -= cantidadDePersonasASalir;
        System.out.println(cantidadDePersonasASalir + " personas salieron. Total: " + this.personasDentro);
        return true;
    }
}

