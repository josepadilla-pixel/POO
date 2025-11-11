package ProyectoFinal;

public class Acensor {
    private int pisoActual;
    private int pisoMinimo;
    private int pisoMaximo;
    private int capacidadMaxima;
    private int personasDentro;
    private boolean puertaAbierta;
    private String estado;// "Subiendo", "Bajando","Detenido" 

    public Acensor(int pisoMinimo,int pisoMaximo,int capacidadMaxima){
        this.pisoActual = pisoMinimo;
        this.pisoMinimo = pisoMinimo;
        this.pisoMaximo = pisoMaximo;
        this.capacidadMaxima = capacidadMaxima;
        this.personasDentro = 0; 
        this.puertaAbierta = false;
        this.estado = "Detenido"; 
    }

    public Acensor(){
        this(0 ,10 ,8);
    } 
    // getters and setters 

    public int getpisoActual(){
        return pisoActual;
    }  

    public void setpisoActual(int pisoActual){
        this.pisoActual = pisoActual;
    } 

    public int pisoMinimo(){
        return pisoMinimo;
    } 
    public int pisoMaximo(){
       return pisoMaximo;
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    } 
    public int getPersonasDentro(){
        return personasDentro;
    } 
    public void setPersonasDentro(int personasDentro){
        this.personasDentro = personasDentro;
    }
    public boolean getPuertaAbierta(){
        return puertaAbierta;
    }
    public void setPuertaAbierta(boolean puertaAbierta){
      this.puertaAbierta = puertaAbierta;
    } 
    public String getEstado(){
        return  estado;
    } 

    public void setEstado(String estado){
        this.estado = estado;
    }





}
