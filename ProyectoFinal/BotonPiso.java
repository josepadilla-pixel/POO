package ProyectoFinal;

/**
 * Clase que representa un botón ubicado en los pisos del edificio
 * Permite solicitar el ascensor para subir o bajar
 * 
 * 
 */
public class BotonPiso extends Boton {
    private final String direccion;
    private final int numeroPiso;

    /**
     * Constructor del botón de piso
     * 
     * @param numeroPiso Número del piso donde está ubicado el botón
     * @param funcion    Descripción de la función del botón
     * @param direccion  Dirección de movimiento ("arriba" o "abajo")
     * @throws IllegalArgumentException Si la dirección no es válida
     */
    public BotonPiso(int numeroPiso, String funcion, String direccion) {
        super(funcion);
        if (!direccion.equalsIgnoreCase("arriba") && !direccion.equalsIgnoreCase("abajo")) {
            throw new IllegalArgumentException("Dirección debe ser ARRIBA o ABAJO");
        }
        this.direccion = direccion;
        this.numeroPiso = numeroPiso;
    }

    /**
     * Ejecuta la funcionalidad específica del botón de piso
     * Anuncia la solicitud de ascensor en una dirección específica
     */
    @Override
    public void ejecutarFuncionalidad() {
        System.out.println("Solicitud de: " + direccion + " desde piso " + numeroPiso);
    }

    // Getters

    /**
     * @return Dirección de movimiento del botón ("arriba" o "abajo")
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return Número del piso donde está ubicado el botón
     */
    public int getNumeroPiso() {
        return numeroPiso;
    }

    @Override
    public boolean esBoton(int piso, String direccion) {
        return this.numeroPiso == piso && this.direccion.equalsIgnoreCase(direccion);
    }
}
