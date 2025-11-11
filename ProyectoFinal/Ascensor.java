package ProyectoFinal;

public class Ascensor {
    private int pisoActual;
    private int pisoMinimo;
    private int pisoMaximo;
    private int capacidadMaxima;
    private int personasDentro;
    private String estado;// "Subiendo", "Bajando","Detenido" 

    public Ascensor(int pisoMinimo,int pisoMaximo,int capacidadMaxima){
        this.pisoActual = pisoMinimo;
        this.pisoMinimo = pisoMinimo;
        this.pisoMaximo = pisoMaximo;
        this.capacidadMaxima = capacidadMaxima;
        this.personasDentro = 0; 
        this.estado = "Detenido"; 
    }

    public Ascensor(){
        this(1 ,10 ,8);
    } 
    // getters and setters 

    public int getpisoActual(){
        return pisoActual;
    }  

    public void setpisoActual(int pisoActual){
        this.pisoActual = pisoActual;
    } 

    public int getpisoMinimo(){
        return pisoMinimo;
    } 
    public int getpisoMaximo(){
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
    public String getEstado(){
        return  estado;
    } 

    public void setEstado(String estado){
        this.estado = estado;
    }





}
