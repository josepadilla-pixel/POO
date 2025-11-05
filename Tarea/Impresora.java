public class Impresora extends Producto {
    private String color;
    private Foto[] fotos; 


     public Impresora(int numero, String nombre, double precio, String color, Foto[] fotos) {
        super(numero, nombre, precio); // Llama al constructor de Producto
        this.color = color;
        this.fotos = fotos;
    } 

    public void imprimir(){
        System.out.println("Impriminedo foto en colores "+color);
    } 

    public String toString() {return "Impresión: " + nombredelproducto +"  Color: " + color +"  Precio: " + precio;}


    






    
}
