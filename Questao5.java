/* finalizar codigo */
public class Questao5 {
    public static void main(String[] args) {

        int[] matriz = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < matriz.length; i++) {

            System.out.println(matriz[i]);
        }

        int num = 2;

        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[ j ] * num);
        }

    }
}