public class Celular extends DispositivoElectronico {
    int niveldebateria;

    public Celular(String marca, String modelo, int niveldebateria) {
        super(marca, modelo);
        this.niveldebateria = niveldebateria;

    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println(marca + " " + modelo + " está encendido." + niveldebateria + "%");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println(marca + " " + modelo + " está apagado.");
    }

}