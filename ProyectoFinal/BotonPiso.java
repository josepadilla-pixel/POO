package ProyectoFinal;

public class BotonPiso extends Boton {
    private final String direccion; 
    private int numerodePiso;

    public BotonPiso(int numerodePiso,String funcion,String direccion){
        super(funcion);
        if(!direccion.equalsIgnoreCase("arriba")&& !direccion.equalsIgnoreCase("abajo")) {
            throw new IllegalArgumentException("Direccion debe ser ARRIBA o ABAJO");
        }
        this.direccion = direccion; 
        this.numerodePiso = numerodePiso; 
    } 
    
    public void funcionalidad(String funcion){
        System.out.println("Solicitud de: "+direccion+" desde piso "+numerodePiso);
    } 

    // getters and setters

    public String getdireccion(){
        return direccion;
    } 
   
    public int getnumedePsio(){
        return numerodePiso;
    } 

    

}
