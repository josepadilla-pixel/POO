public class DispositivoElectronico {

    protected String marca;
    protected String modelo;
    protected boolean encendido;

    public DispositivoElectronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(marca + " " + modelo + " está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(marca + " " + modelo + " está apagado.");
    }
}
