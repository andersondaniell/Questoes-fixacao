
public class Questao1 {

    public static void main(String[] args) {

        int[] numeros = { 10, 15, 20, 25, 30, 35, 40 };
        int menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < numeros[i] + 1) {
                menor = numeros[i];

            } else {
                menor = numeros[i] + 1;

            }

        }
        System.out.println(menor);

    }

}
