import java.util.Scanner;

public class Exercicio412 {

    public static void main(String[] args) {

        int n[][] = new int[5][5];
        int l, c, t;

        Scanner sc = new Scanner(System.in);

        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.println("Digite elemento " + l + 1 + "-" + c + 1);
                n[l][c] = sc.nextInt();
            }

        }

        System.out.println("Toda a matriz ");

        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.println(n[l][c]);
            }

            System.out.println("So os elementos nas posicoes cuja num par");
            for (l = 0; l < 5; l++) {
                for (c = 0; c < 5; c++) {
                    if ((l + c) % 2 == 0) {
                        System.out.println(n[l][c]);
                    }

                }
            }
        }

    }

}
