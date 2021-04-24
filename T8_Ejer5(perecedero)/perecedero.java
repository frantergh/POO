/**
 * perecedero Francisco de la Resurreccion
 */
public class perecedero extends producto {
    // Atributos
    int diasACaducar;
    int averageMark;

    // Constructores
    public perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;

    }

    // Getters && Setters
    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }


    // Metodo
    @Override
    public double calcular(int cantidad) {
        // TODO Auto-generated method stub
        double resultado = super.calcular(cantidad);

        if (diasACaducar == 1) {
            resultado = super.calcular(cantidad) / 4;
        }
        if (diasACaducar == 2) {
            resultado = super.calcular(cantidad) / 3;
        }
        if (diasACaducar == 3) {
            resultado = super.calcular(cantidad) / 2;
        }

        return resultado;
    }
}
