public class Main {
    public static void main(String[] args) {
        /**
         * Array de 4
         */
        Publicaciones[] publi = new Publicaciones[4];

        publi[0] = new Revistas(0001, "2019", true, 7);
        publi[1] = new Revistas(0002, "2020", false, 4);

        publi[2] = new Libros(0003, "2021", true, "Juanan");
        publi[3] = new Libros(0004, "2022", false, "Roberto");

        /**
         * Bucle
         */
        for (int i = 0; i < publi.length; i++) {
            System.out.println(publi[i].toString());
        }

        // Metodo devolver
        publi[0].devolver();
        publi[3].devolver();

        // Metodo prestar
        publi[1].prestar();
        publi[2].prestar();
    }

}
