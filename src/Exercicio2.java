import java.util.Arrays;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {

        Random random = new Random();

        int rnd;
        int matriz[][] = new int[5][5];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[0][0] != matriz[0][0]) {
                    matriz[i][j] = random.nextInt(10);
                }
                System.out.println(matriz[i][j]);

            }
        }
    }
}
