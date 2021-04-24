public class producto {
    /**
     * Franciso de la Resurreccion Gomar
     * 
     */

    // Atributos
    String nombre;
    double precio;

    // Constructores

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters && Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    // Metodo
    @Override
    public String toString() {
        return "producto [nombre=" + nombre + ", precio=" + precio + "]";
    }

    public double calcular(int cantidad) {

        return cantidad * precio;

    }

}
