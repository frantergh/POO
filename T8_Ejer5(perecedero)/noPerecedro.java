/**
 * noPerecedro Francisco de la Resurreccion Gomar
 */
public class noPerecedro extends producto {

    // Atributos

    String tipo;

    // Constructores

    public noPerecedro(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    // Getters && Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcular(int cantidad) {
        // TODO Auto-generated method stub
        return super.calcular(cantidad);
    }

}