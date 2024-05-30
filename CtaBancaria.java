import java.io.InputStream;
import java.util.Scanner;

public class CtaBancaria {
    public String nombre;
    public int cedula;
    public static float monto;

    public CtaBancaria(String nombre, int cedula, float monto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.monto = monto;
    }


    static class CtaAhorro extends CtaBancaria {
        public String Direccion;
        public float meta;
        private Scanner scanner = new Scanner(System.in);
        public CtaAhorro(String nombre, int cedula, float monto, String direccion, float meta) {
            super(nombre, cedula, monto);
            Direccion = direccion;
            this.meta = meta;
        }

        public float depositar(){

            System.out.println("Desea Ingresar 5 dolares a su cuenta: ");
            System.out.println("si o no: ");
            String respuesta=scanner.next();
            if(respuesta.equalsIgnoreCase("si")) {
                monto=monto+5;
            }
            System.out.println("Su monto es de: "+monto);
            return monto;
        }
    }
}
