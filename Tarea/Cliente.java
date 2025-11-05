public class Cliente {
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;

     public Cliente(String cedula, String nombre, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    } 
    

    public void realizarPedido(Pedido pedido) {
        System.out.println(nombre + " ha realizado un pedido  ");
    }

   public String toString() {
       return "Cliente{" +"cedula='" + cedula +", nombre='" + nombre +  ", telefono='" + telefono +  ", direccion='" + direccion +  +'}';
    }










    
}
