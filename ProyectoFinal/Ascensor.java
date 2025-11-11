package ProyectoFinal;

/**
 * Clase que representa el ascensor con sus atributos y estado actual
 * Controla la posición, capacidad y movimiento del ascensor
 * 
 * 
 */
public class Ascensor {
    private int pisoActual;
    private int pisoMinimo;
    private int pisoMaximo;
    private int capacidadMaxima;
    private int personasDentro;
    private String estado; // "Subiendo", "Bajando", "Detenido"

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
    }

    /**
     * Constructor por defecto del ascensor
     * Configura pisos del 1 al 10 con capacidad para 8 personas
     */
    public Ascensor() {
        this(1, 10, 8);
    }

    // Getters y Setters

    /**
     * @return Piso actual donde se encuentra el ascensor
     */
    public int getPisoActual() {
        return pisoActual;
    }

    /**
     * Establece el piso actual del ascensor
     * 
     * @param pisoActual Nuevo piso actual
     */
    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    /**
     * @return Piso mínimo al que puede llegar el ascensor
     */
    public int getPisoMinimo() {
        return pisoMinimo;
    }

    /**
     * @return Piso máximo al que puede llegar el ascensor
     */
    public int getPisoMaximo() {
        return pisoMaximo;
    }

    /**
     * @return Capacidad máxima de personas en el ascensor
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * @return Número de personas actualmente dentro del ascensor
     */
    public int getPersonasDentro() {
        return personasDentro;
    }

    /**
     * Establece el número de personas dentro del ascensor
     * 
     * @param personasDentro Nuevo número de personas
     */
    public void setPersonasDentro(int personasDentro) {
        this.personasDentro = personasDentro;
    }

    /**
     * @return Estado actual del ascensor ("Subiendo", "Bajando", "Detenido")
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del ascensor
     * 
     * @param estado Nuevo estado ("Subiendo", "Bajando", "Detenido")
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
