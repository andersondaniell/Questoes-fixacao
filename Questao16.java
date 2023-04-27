public class Questao16 {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        int num = 2;

        for (int i : numeros) {
            int maiores = i + num;

            System.out.println(maiores);
        }
    }
}
