package ProyectoFinal;

/**
 * Clase base que representa un botón genérico del sistema de ascensor
 * Proporciona funcionalidades básicas como presionar, iluminar y apagar
 * 
 *
 */
public class Boton {
    protected boolean iluminado;
    protected boolean presionado;
    protected String funcion;

    /**
     * Constructor de la clase Boton
     * 
     * @param funcion Descripción de la función que cumple el botón
     */
    public Boton(String funcion) {
        this.iluminado = false;
        this.presionado = false;
        this.funcion = funcion;
    }

    /**
     * Ilumina el botón indicando que está activo
     */
    public void iluminar() {
        iluminado = true;
        System.out.println("El botón " + funcion + " iluminado");
    }

    /**
     * Apaga la iluminación del botón
     */
    public void apagar() {
        iluminado = false;
        System.out.println("El botón " + funcion + " apagado");
    }

    /**
     * Simula la acción de presionar el botón
     */
    public void presionar() {
        presionado = true;
        System.out.println("El botón " + funcion + " fue presionado");
    }

    /**
     * Ejecuta la funcionalidad específica del botón
     * Este método será sobrescrito por las subclases
     */
    public void ejecutarFuncionalidad() {
        System.out.println("Funcionalidad base del botón: " + funcion);
    }

    /**
     * Comprueba si el botón corresponde a un piso y/o dirección.
     * 
     * @param piso      El número de piso.
     * @param direccion La dirección (puede ser null).
     * @return true si el botón corresponde, false en caso contrario.
     */
    public boolean esBoton(int piso, String direccion) {
        return false;
    }

    // Getters y Setters

    /**
     * @return Estado de iluminación del botón
     */
    public boolean getIluminado() {
        return iluminado;
    }

    /**
     * Establece el estado de iluminación del botón
     * 
     * @param iluminado Nuevo estado de iluminación
     */
    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }

    /**
     * @return Estado de presionado del botón
     */
    public boolean getPresionado() {
        return presionado;
    } 
    
    public String getfuncion(){
        return funcion;
    }

    /**
     * Establece el estado de presionado del botón
     * 
     * @param presionado Nuevo estado de presionado
     */
    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }
}
