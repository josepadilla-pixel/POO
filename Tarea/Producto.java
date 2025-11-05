public class Producto {
    private int numeroDelProducto;
    private String nombreDelProducto;
    private double precio;

    public Producto(int numeroDelProducto, String nombreDelProducto, double precio) {
        this.numeroDelProducto = numeroDelProducto;
        this.nombreDelProducto = nombreDelProducto;
        this.precio = precio;
    } 

    public double precio(){
        return precio;
    }

    public double calcularprecio(){
        return precio;
    }

  public String toString() {
        return "Producto{" +"numeroDelProducto=" + numeroDelProducto +" nombreDelProducto='" + nombreDelProducto + " precio=" + precio +'}';
    }







}
