public class Futbol {
    private int cedula;
    private String nombre;
    private int camiseta;

    public Futbol(int cedula, String nombre, int camiseta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.camiseta = camiseta;
    }

    private void mostrarInfo() {
        System.out.println("El jugador " + nombre + " tiene el número " + camiseta);
    }

    public void mostrarInformacion() {
        mostrarInfo();
    }
}

class Defensa extends Futbol {
    private String posicion;
    private int tarjetas;
    private int goles;
    private int faltas;

    public Defensa(int cedula, String nombre, int camiseta, String posicion, int tarjetas, int goles, int faltas) {
        super(cedula, nombre, camiseta);
        this.posicion = posicion;
        this.tarjetas = tarjetas;
        this.goles = goles;
        this.faltas = faltas;
    }

    public void mostrarInfoDefensa() {
        mostrarInformacion();
        System.out.println("Jugando en la posición " + posicion + ", ha marcado un total de " + goles + " goles y ha cometido " + faltas + " faltas.");
    }
}