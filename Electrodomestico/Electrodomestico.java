/**
 * Electrodomestico
 */
public class Electrodomestico {

    private double precioBase;
    private String color;
    int peso;
    char consumoEnergetico;

    public Electrodomestico(double precioBase, String color, int peso, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = comprobarConsnumo(consumoEnergetico);

    }

    public Electrodomestico(double precioBase, int peso) {

        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.precioBase = precioBase;
        this.peso = peso;

    }

    public Electrodomestico() {
        precioBase = 100;
        color = "blanco";
        peso = 5;
        consumoEnergetico = 'F';
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    private char comprobarConsnumo(char letra) {
        boolean existe = false;

        char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                existe = true;
            }
        }
        if (existe) {
            return letra;
        } else {
            return this.consumoEnergetico;
        }
    }

    private String comprobarColor(String color) {
        boolean existe = false;

        String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
        for (int i = 0; i < colores.length; i++) {
            if (colores[i] == color) {
                existe = true;
            }
        }
        if (existe) {
            return color;
        } else {
            return this.color;
        }
    }

    public double precioFinal() {
        double precioFinal = 0;

        if (this.consumoEnergetico == 'A') {
            precioFinal = precioBase + 100;
        }
        return precioFinal;
        if (this.consumoEnergetico == 'B') {
            precioFinal = precioBase + 80;
        }
        return precioFinal;
        if (this.consumoEnergetico == 'C') {
            precioFinal = precioBase + 60;
        }
        return precioFinal;
        if (this.consumoEnergetico == 'D') {
            precioFinal = precioBase + 50;
        }
        return precioFinal;
        if (this.consumoEnergetico == 'E') {
            precioFinal = precioBase + 30;
        }
        return precioFinal;
        if (this.consumoEnergetico == 'F') {
            precioFinal = precioBase + 10;
        }
        return precioFinal;

    }

}
