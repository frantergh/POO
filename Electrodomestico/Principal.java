import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

        Electrodomestico electrodomestico1 = new Electrodomestico();
        electrodomesticos.add(electrodomestico1);

        Electrodomestico electrodomestico2 = new Electrodomestico(10, 66);
        electrodomesticos.add(electrodomestico2);

        Electrodomestico electrodomestico3 = new Electrodomestico(30, "azul", 77, 'A');
        electrodomesticos.add(electrodomestico3);

        Electrodomestico electrodomestico4 = new Electrodomestico(20, "verde", 66, 'D');
        electrodomesticos.add(electrodomestico4);

        Electrodomestico electrodomestico5 = new Electrodomestico(34, "orange", 44, 'F');
        electrodomesticos.add(electrodomestico5);

        Electrodomestico electrodomestico6 = new Electrodomestico(55, "yelloow", 99, 'B');
        electrodomesticos.add(electrodomestico6);

        Electrodomestico electrodomestico7 = new Electrodomestico(28, "marron", 55, 'C');
        electrodomesticos.add(electrodomestico7);

        Electrodomestico electrodomestico8 = new Electrodomestico(45, "cian", 33, 'D');
        electrodomesticos.add(electrodomestico8);

        Electrodomestico electrodomestico9 = new Electrodomestico(66, "magenta", 88, 'J');
        electrodomesticos.add(electrodomestico9);

        Electrodomestico electrodomestico10 = new Electrodomestico(40, "morado", 33, 'L');
        electrodomesticos.add(electrodomestico10);

        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println("precioBase="+electrodomestico.getPrecioBase() + " " + electrodomestico.getColor() + " " + electrodomestico.peso
                    + " " + electrodomestico.consumoEnergetico+"precioFinal="+electrodomestico.precioFinal());

        }

    }
}
