public class Publicaciones extends interfaz {
    // Atributos
    private int codigo;
    private String añoPubli;
    private boolean prestado;

    // Consturcor
    /**
     * Constructor por defecto con prestado = false
     * 
     * @param prestado indica si el libro esta prestado o en la libreria
     */
    public Publicaciones() {
        prestado = false;
    }

    public Publicaciones(int codigo, String añoPubli) {
        this.codigo = codigo;
        this.añoPubli = añoPubli;
        prestado = false;
    }

    public Publicaciones(int codigo, String añoPubli, boolean prestado) {
        this.codigo = codigo;
        this.añoPubli = añoPubli;
        this.prestado = prestado;
    }

    // Getters && Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAñoPubli() {
        return añoPubli;
    }

    public void setAñoPubli(String añoPubli) {
        this.añoPubli = añoPubli;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Metodos

    /**
     * Encadena atributos y sus valores
     */
    public String toString() {
        return "Codigo:" + codigo + " Año de la Publicación:" + añoPubli + " Prestado=" + prestado;
    }

    // Interface

    /**
     * metodo si esta prestado o no
     */
    @Override
    public boolean prestado() {
        return prestado;
    }

    /**
     * metodo si esta disponible el libro o se puede prestar
     */
    @Override
    public void prestar() {
        if (prestado()) {
            System.out.println("NO esta disponible");
        } else {
            System.out.println("Si que esta disponible");
        }
    }

    /**
     * metodo de vuelta si esta en el almacen o en el almacen
     */
    @Override
    public void devolver() {
        if (prestado()) {
            System.out.println("prestado");
        } else {
            System.out.println("en el almacen");
        }

    }

}
