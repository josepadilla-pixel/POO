public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void mostrar() {
        System.out.println("Mostrando foto: " + fichero);
    }

    public String toString() {
        return "Foto{" + "fichero='" + fichero + '}';
    }

}
