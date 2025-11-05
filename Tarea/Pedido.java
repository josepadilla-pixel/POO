public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private String fecha;
    private String metododepago;
    private String estado;
    private double total;

    public Pedido(Cliente cliente, Producto[] productos, String fecha, String metododepago, String estado,
            double total) {
        this.cliente = cliente;
        this.productos = productos;
        this.metododepago = metododepago;
        this.estado = estado;
        this.fecha = fecha;
        this.total = total;
    }

    public double calcularTotal() {
        total = 0;
        for (Producto p : productos) {
            total += p.calcularprecio();
        }
        return total;
    }

    public String toString() {
        return "Pedido{" + "cliente:" + cliente + " fecha:" + fecha + "Metodo de pago:" + metododepago + ",estado:'"
                + estado + " total:" + total + '}';
    }

}
