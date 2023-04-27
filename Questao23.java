public class Questao23 {
    public static void main(String[] args) {
        double[] numeros = { 10, 8, 8, 10 };
        double media = 0;
        double somaNum = 0;
        for (double d : numeros) {
            somaNum += d;
            System.out.println(somaNum / numeros.length);

        }
    }
}
