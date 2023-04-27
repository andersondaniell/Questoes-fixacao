public class Questao20 {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < numeros.length - 1; i++) {
            if(i % 2==0){
                System.out.println(i);
            }
        }
    }
}
