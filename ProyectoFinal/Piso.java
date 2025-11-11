package ProyectoFinal;
/**
 * Clase que representa cada piso del edificio
 * Solo contiene información del piso, sin instanciar botones
 * 
 */
public class Piso {
    private final int numeroPiso;
    private final boolean esPrimerPiso;
    private final boolean esUltimoPiso;
    private final Puerta puertaPiso;

    /**
     * Constructor para pisos intermedios
     * @param numeroPiso Número identificador del piso
     */
    public Piso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.esPrimerPiso = false;
        this.esUltimoPiso = false;
        this.puertaPiso = new Puerta();
    }

    /**
     * Constructor para pisos extremos
     * @param numeroPiso Número identificador del piso
     * @param esPrimerPiso true si es el primer piso
     * @param esUltimoPiso true si es el último piso
     */
    public Piso(int numeroPiso, boolean esPrimerPiso, boolean esUltimoPiso) {
        this.numeroPiso = numeroPiso;
        this.esPrimerPiso = esPrimerPiso;
        this.esUltimoPiso = esUltimoPiso;
        this.puertaPiso = new Puerta();
    }

    // Getters

    /**
     * @return Número identificador del piso
     */
    public int getNumeroPiso() {
        return numeroPiso;
    }

    /**
     * @return true si es el primer piso
     */
    public boolean esPrimerPiso() {
        return esPrimerPiso;
    }

    /**
     * @return true si es el último piso
     */
    public boolean esUltimoPiso() {
        return esUltimoPiso;
    }

    /**
     * @return Puerta asociada al piso
     */
    public Puerta getPuertaPiso() {
        return puertaPiso;
    }
}