public class Impresora extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresora(int numerodelProducto, String nombredelProducto, double precio, String color, Foto[] fotos) {
        super(numerodelProducto, nombredelProducto, precio);
        this.color = color;
        this.fotos = fotos;
    }

    public void imprimir() {
        System.out.println("Imprimiendo fotos en color " + color);

        int i = 0;
        while (i < fotos.length) {
            System.out.println(fotos[i]);
            i++;
        }
    }

    public String toString() {
        return "Impresión: " + nombredelProducto + "  Color: " + color + "  Precio: " + precio;
    }

}
