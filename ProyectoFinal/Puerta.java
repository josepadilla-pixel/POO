package ProyectoFinal;

/**
 * Clase que representa la puerta del ascensor
 * Controla la apertura, cierre y detección de obstáculos
 * 
 * 
 */
public class Puerta {
    private boolean puertaAbierta;
    private boolean obstaculoDetectado;

    /**
     * Constructor de la puerta
     * Inicializa la puerta cerrada sin obstáculos
     */
    public Puerta() {
        puertaAbierta = false;
        obstaculoDetectado = false;
    }

    /**
     * Abre la puerta del ascensor
     */
    public void abrirPuerta() {
        puertaAbierta = true;
        System.out.println("Puerta abierta");
    }

    /**
     * Cierra la puerta del ascensor si no hay obstáculos
     */
    public void cerrarPuerta() {
        if (obstaculoDetectado) {
            System.out.println("Hay un obstáculo, no se puede cerrar la puerta");
        } else {
            puertaAbierta = false;
            System.out.println("Puerta cerrada");
        }
    }

    // Getters y Setters

    /**
     * @return true si se detecta un obstáculo, false en caso contrario
     */
    public boolean getObstaculoDetectado() {
        return obstaculoDetectado;
    }

    /**
     * @return true si la puerta está abierta, false si está cerrada
     */
    public boolean getPuertaAbierta() {
        return puertaAbierta;
    }

    /**
     * Establece el estado de detección de obstáculos
     * 
     * @param obstaculoDetectado Nuevo estado de detección
     */
    public void setObstaculoDetectado(boolean obstaculoDetectado) {
        this.obstaculoDetectado = obstaculoDetectado;
        if (obstaculoDetectado) {
            System.out.println("ALERTA: Obstáculo detectado");
        }
    }
}