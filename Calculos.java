public class Calculos {
    private float valor1,valor2,valor3;

    public Calculos() {
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getValor3() {
        return valor3;
    }

    public void setValor3(float valor3) {
        this.valor3 = valor3;
    }
    static class sumatoria extends Calculos{


        public sumatoria() {
            super();
        }

        public float suma(){
            return getValor1()+getValor2()+getValor3();
        }
    }
}
