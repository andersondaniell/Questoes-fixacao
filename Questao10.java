public class Questao10 {
    public static void main(String[] args) {
        int[] media = { 10, 10, 10, 10 };
        int somaMedia = 0;

        for (int i = 0; i < media.length; i++) {
            somaMedia += media[i];

        }

        System.out.println(somaMedia / media.length);

    }
}
