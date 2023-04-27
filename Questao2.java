public class Questao2 {
    public static void main(String[] args) {
        int[] soma = { 2, 4, 6, 7, 8, 3 };
        int somaNum = 0;

        for (int i = 0; i < soma.length; i++) {
            somaNum += soma[i];
        }
        System.out.println(somaNum);
    }
}
