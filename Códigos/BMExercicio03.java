public class BMExercicio03 {

    public static void main(String[] arg) {

        double item1 = 2.95;
        double item2 = 3.50;

        System.out.println("O item 1  custa" + item1 + "e o item 2 custa" + item2);

        double total = item1 + item2;

        final double taxaCalculada = 8.25 / 100;
        System.out.println("Taxa calculada: "+ taxaCalculada);

        item1 *= taxaCalculada;
        item2 *= taxaCalculada;

        double novoCusto = item1 + item2;

        boolean muitoCaro = novoCusto > 10 ? true : false;

        System.out.println(muitoCaro);
    }

}
