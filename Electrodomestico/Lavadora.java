/**
 * Lavadora
 */
public class Lavadora extends Electrodomestico {
    int carga = 5;

    public Lavadora(int precioBase, int peso, int carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        // TODO Auto-generated method stub
        super.precioFinal();
        /*
         * if (peso > 30 ) { precioBase+=50; }
         */
    }

}
