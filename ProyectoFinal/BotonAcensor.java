package ProyectoFinal;

/**
 * Clase que representa un botón interno del ascensor
 * Permite seleccionar el piso destino desde dentro del ascensor
 * 
 * 
 */
public class BotonAcensor extends Boton {
    private final int pisoDestino;

    /**
     * Constructor del botón de ascensor
     * 
     * @param funcion     Descripción de la función del botón
     * @param pisoDestino Número del piso destino asociado al botón
     */
    public BotonAcensor(String funcion, int pisoDestino) {
        super(funcion);
        this.pisoDestino = pisoDestino;
    }

    /**
     * Ejecuta la funcionalidad específica del botón de ascensor
     * Anuncia la solicitud de movimiento al piso destino
     */
    @Override
    public void ejecutarFuncionalidad() {
        System.out.println("Solicitud de ir al piso " + pisoDestino);
    }

    /**
     * @return Número del piso destino asociado al botón
     */
    public int getPisoDestino() {
        return pisoDestino;
    }
}
