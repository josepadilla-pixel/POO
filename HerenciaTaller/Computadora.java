public class Computadora extends DispositivoElectronico {
    int memoriaRAM;

    public Computadora(String marca, String modelo, int memoriaRAM) {
        super(marca, modelo);
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println(marca + " " + modelo + " está encendido.Memoria Ram:" + memoriaRAM);
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println(marca + " " + modelo + " está apagado.");
    }

}
