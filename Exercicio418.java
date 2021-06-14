import java.util.Scanner;

public class Exercicio418 {

    public static void main(String[] args) {

        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int soma[][] = new int[4][4];
        int l, c;

        Scanner sc = new Scanner(System.in);

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.println("digite elemento de A [ " + l + 1 + "][" + c + 1 + "]");
                a[l][c] = sc.nextInt();
            }
        }

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.println("digite elemento de B [ " + l + 1 + "][" + c + 1 + "]");
                b[l][c] = sc.nextInt();
                soma[l][c] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ SOMA");

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.println(soma[l][c]);
            }
        }
    }

}
