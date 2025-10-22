public class Prueba {

    public static void main(String[] args) {
        DispositivoElectronico miCelular = new Celular("Samsung", "Galaxy A55", 90);
        miCelular.encender();
        miCelular.apagar();

        System.out.println();

        DispositivoElectronico miPC = new Computadora("HP", "Pavilion", 16);
        miPC.encender();
        miPC.apagar();

    }
}
