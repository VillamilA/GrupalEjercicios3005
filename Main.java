public class Main {
    public static void main(String[] args) {
        float suma;
        Calculos.sumatoria sum = new Calculos.sumatoria();
        sum.setValor1(5);
        sum.setValor2(2);
        sum.setValor3(3.5f);
        System.out.println("la suma es: "+sum.suma());

    }
}