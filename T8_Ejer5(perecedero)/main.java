public class main {
/**
 * Francisco de la Resurreccion Gomar
*/
    public static void main(String[] args) {

        producto productos[] = new producto[5];

        // Array
        productos[0] = new perecedero("alberjina", 6.6, 1);
        productos[1] = new noPerecedro("parmesano", 2.5, "queso");
        productos[2] = new perecedero("pizza", 3.3, 3);
        productos[3] = new perecedero("manzana", 9.2, 4);
        productos[4] = new noPerecedro("kiwii", 5.7, "fruta");

        
        // Calculo del precio
        for (int i = 0; i < productos.length; i++) {

            System.out.println(productos[i].toString());
            System.out.println(productos[i].calcular(3));
        }

    }

}
