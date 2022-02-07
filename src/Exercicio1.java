import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int matriz [] [] = new int[2][4];

        matriz[0][0]= 1;
        matriz[0][1]= 5;
        matriz[0][2]= 30;
        matriz[0][3]= 40;

        matriz[1][0]= 50;
        matriz[1][1]= 6;
        matriz[1][2]= 7;
        matriz[1][3]= 8;

        int maior=0;
        int soma=0;

        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                soma += matriz[i][j];

                if (matriz[i][j]>10){
                maior+=1;
               }
            }
        }
        System.out.println("A soma é: " + soma + "\nQuantidade de numeros maiores que 10: "+ maior);
    }

}
