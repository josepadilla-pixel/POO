public class Camara extends Producto {
  private String marca;
  private String modelo;

  public Camara(int numero, String nombre, double precio, String marca, String modelo) {
    super(numero, nombre, precio);
    this.marca = marca;
    this.modelo = modelo;
  }

  public String toString() {
    return "Camara{" + "marca='" + marca + ", modelo='" + modelo + ", precio=" + precio + '}';
  }

}
