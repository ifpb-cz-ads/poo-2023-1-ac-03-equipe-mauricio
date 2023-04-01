public class CBBAtividadePratica3 {

    public static double calcularArea(double largura, double comprimento) {

        return largura * comprimento;

    }

    public static void main (String[] arg){

        int largura = 2;
        int comprimento = 5;

        double area = calcularArea(largura, comprimento);

        System.out.printf("%.2f m^2", area);

    }


}
