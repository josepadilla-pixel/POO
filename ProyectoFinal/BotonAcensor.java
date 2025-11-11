package ProyectoFinal;

public class BotonAcensor extends Boton{
    private final int pisoDestino;
    
    public BotonAcensor(String funcion,int pisoDestino){
        super(funcion);
        this.pisoDestino = pisoDestino;

    } 

     public void funcionalidad(String funcion){
        System.out.println("Solicitud de ir al piso "+pisoDestino);
    }  
    
    // getter
    public int getpisoDestino(){
        return pisoDestino;
    }












}
