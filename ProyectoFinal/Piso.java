package ProyectoFinal;

public class Piso {
    private final int numPiso;
    private final BotonPiso botonsubida;
    private final BotonPiso botonbajada;
    private final Puerta puertapiso;

    /*
     * El @param es una etique que se usa en los comentarios 
     * para describir los parametros de un metodo o constructor
     */

    /*
     * @param numPiso: Es el numero de piso en el esta el usuario
     * 
     * @param funcionbotonsubida: Es la funcionalidad que cumple ese boton de subida
     * 
     * @param funcionbotonbajada: Es la funcionalidad que cumple ese boton de bajada
     */
    public Piso(int numPiso, String funcionbotonsubida, String funcionbotonbajada) {
        this.numPiso = numPiso;
        this.botonsubida = new BotonPiso(numPiso, funcionbotonsubida, "arriba");
        this.botonbajada = new BotonPiso(numPiso, funcionbotonbajada, "abajo");
        this.puertapiso = new Puerta();
    }

    /*
     * @param numPiso: Es el numero de piso en el esta el usuario
     * 
     * @param esultimoPiso: Sirve para indicar que esta en el ultimo piso al usuario
     * 
     * @param funcionbotonbajada: Es la funcionalidad que cumple ese boton de bajada
     */
    public Piso(int numPiso,boolean esultimoPiso, String funcionbotonbajada) {
        this.numPiso = numPiso;
        this.botonsubida = null;
        this.botonbajada = new BotonPiso(numPiso, funcionbotonbajada, "abajo");
        this.puertapiso = new Puerta();
    }

    /*
     * @param numPiso: Es el numero de piso en el esta el usuario
     * 
     * @param funcionbotonsubida: Es la funcionalidad que cumple ese boton de subida
     * 
     * @param esprimerPiso: Sirve para indicar que esat en el primer piso al usuario
     */
    public Piso(int numPiso, String funcionbotonsubida, boolean esprimerPiso) {
        this.numPiso = numPiso;
        this.botonsubida = new BotonPiso(numPiso, funcionbotonsubida, "arriba");
        this.botonbajada = null;
        this.puertapiso = new Puerta();
    } 

    //getters

    public int getnumedePsio(){
        return numPiso;
    } 
    public BotonPiso botonsubida(){
       return  botonsubida;
    } 
    public BotonPiso botonbajada(){
        return botonbajada;
    } 
    public Puerta puertapiso(){
        return puertapiso;
    }


















}
