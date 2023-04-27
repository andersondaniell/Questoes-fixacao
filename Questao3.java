public class Questao3 {

    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5 };
        int somaNum = 0;

        int[] numeros2 = { 5, 4, 3, 2, 1 };
        int somaNum2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            somaNum += numeros[i];

        }
        for (int i = 0; i < numeros2.length; i++) {
            somaNum2 += numeros2[i];

        }

        System.out.println(somaNum + somaNum2);

    }

}
