public class Television extends Electrodomestico {

    int resolucion = 20;
    boolean smartTV = false;

    public Television() {
    }

    public Television(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, int peso, char consumoEnergetico, int resolucion,
            boolean smartTV) {
        super(precioBase, color, peso, consumoEnergetico);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }

    @Override
    public void precioFinal() {
        // TODO Auto-generated method stub
        super.precioFinal();
        if (resolucion > 40) {
            precioBase += precioBase * 0.3;
        }
        if (smartTV) {
            precioBase += 50;
        }
    }

}
