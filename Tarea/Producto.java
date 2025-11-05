public class Producto {
    protected int numerodelProducto;
    protected String nombredelProducto;
    protected double precio;

    public Producto(int numerodelProducto, String nombredelProducto, double precio) {
        this.numerodelProducto = numerodelProducto;
        this.nombredelProducto = nombredelProducto;
        this.precio = precio;
    }

    public double getprecio() {
        return precio;
    }

    public double calcularprecio() {
        return precio;
    }

    
    public String toString() {
        return "Producto{" + "numeroDelProducto=" + numerodelProducto + " nombreDelProducto='" + nombredelProducto
                + " precio=" + precio + '}';
    }

}
