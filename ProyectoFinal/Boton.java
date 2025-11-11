package ProyectoFinal;

public class Boton {
    protected boolean iluminar; 
    protected boolean presionado; 
    protected String funcion; 

    public Boton(String funcion){
        this.iluminar=false;
        this.presionado=false;
    } 

    public void iluminar() {
        iluminar = true;
        System.out.println( "El boton "+funcion+ " iluminado");
    } 
    public void presionar(){
        presionado=true;
        System.out.println("El boton "+funcion+"fue presionado");
    } 
    //getters and setters

    public boolean getiluminado(){
        return iluminar;
    } 
    public void setiluminado(boolean iluminado){
        this.iluminar = iluminado;
    } 
    public boolean getpresionar(){
        return presionado;
    } 
    public  void setpresionar(boolean presionado){
        this.presionado = presionado;
    }

 

}
