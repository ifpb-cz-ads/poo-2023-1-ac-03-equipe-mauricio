public class CBBAtividadePratica4 {

    public static double calcularOrcamento (double area) {
        return area * 100;
    }

    public static void main (String[] arg) {

        double areaPiscina = 20;

        System.out.printf("R$%.2f",calcularOrcamento(areaPiscina));

    }
}
