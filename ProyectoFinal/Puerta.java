package ProyectoFinal;

public class Puerta {
private boolean puertaAbierta;
    private boolean obstaculoDetectado; 


    public  Puerta(){
        puertaAbierta=false;
        obstaculoDetectado = false;
    } 

    public void abrirPuerta(){
        puertaAbierta = true; 
        System.out.println("Puerta abierta");
    } 
    public void cerrarPuerta(){
        if(obstaculoDetectado){
            System.out.println("Hay un obtaculo no se puede cerrar la puerta");
        }else{
            puertaAbierta = false;
            System.out.println("Puerta cerrada");
        }
        
    }   

    //getters and setters

    public boolean getobstaculoDetectado(){
        return obstaculoDetectado;
    }

    public boolean getpuertaAbierta(){
        return puertaAbierta;
    }

    public void setobstaculoDetectado(boolean obstaculoDetectado){
        this.obstaculoDetectado = obstaculoDetectado;
        if(obstaculoDetectado){
            System.out.println("ALERTA: Obstaculo detectado");
        }
    }
}
