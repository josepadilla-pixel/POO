package ActividadEvaluativa2;

public class EjecutadorProducto {
    public static void main(String[] args) {

        // Crear producto con datos
        Producto p1 = new Producto("A101", "Mouse Gamer", 2, 85000);

        // Mostrar información inicial
        System.out.println(p1);

        // Aplicar descuento del 10%
        double total = p1.aplicardescuento(10);
        System.out.println("Total con 10% de descuento: " + total);

        // Incrementar cantidad
        p1.imcrementarCantidad(1);

        // Mostrar información final
        System.out.println("Producto actualizado: " + p1);
    }
}

