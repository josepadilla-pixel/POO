package ProyectoFinal;

/**
 * Clase que representa un botón de control de puerta del ascensor
 * Permite mantener la puerta abierta o realizar acciones relacionadas
 * 
 * 
 */
public class BotonPuerta extends Boton {

    /**
     * Constructor del botón de puerta
     * 
     * @param funcion Descripción de la función del botón
     */
    public BotonPuerta(String funcion) {
        super(funcion);
    }

    /**
     * Ejecuta la funcionalidad específica del botón de puerta
     * Anuncia la solicitud relacionada con la puerta
     */
    @Override
    public void ejecutarFuncionalidad() {
        System.out.println("Solicitud: " + funcion);
    }
}
