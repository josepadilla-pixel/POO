public class EjecutadorTemu {
    public static void main(String[] args) {
        Foto f1 = new Foto("paisaje.jpg");
        Foto f2 = new Foto("familia.png");

        Producto impresora = new Impresora(101, "HP Color", 299.99, "Color", new Foto[] { f1, f2 });
        Producto camara = new Camara(102, "Canon EOS", 499.99, "Canon", "EOS 250D");
        Cliente cliente = new Cliente("123456789", "Jose", "3123456789", "Calle 123");

        Producto[] productos = { impresora, camara };
        Pedido pedido = new Pedido(cliente, productos, "10-11-2025", "efcetivo", "Pendiente", 0);

        System.out.println(cliente);
        System.out.println(impresora);
        System.out.println(camara);
        impresora.imprimir();

        System.out.println(pedido);
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        cliente.realizarPedido(pedido);

    }
}
