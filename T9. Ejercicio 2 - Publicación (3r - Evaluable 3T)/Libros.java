public class Libros extends Publicaciones {

    
	// Atributos
	private String autor;

	// Constructor

	public Libros(int codigo, String añoPubli, boolean prestado, String autor) {
		super(codigo, añoPubli, prestado);
		this.autor = autor;
	}

	// Getters && Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	// Metodos
	/**
	 * Metodo toString() devuelve cadena de texto con todos los atributos y sus
	 * valores
	 */
	@Override
	public String toString() {
		return super.toString() + " Autor:" + autor;
	}
}
    
}
