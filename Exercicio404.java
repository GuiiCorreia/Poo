import java.util.Scanner;

public class Exercicio404 {

    public static void main(String[] args) {

        int n[][] = new int[10][10];
        int l, c, t;

        Scanner sc = new Scanner(System.in);

        for (l = 0; l <= 9; l++) {
            for (c = 0; c <= 9; c++) {
                System.out.println(" Entre com elemento linha " + l + 1 + " coluna " + c + 1);
                n[l][c] = sc.nextInt();

            }
        }

        System.out.println("ACIMA DA DIAGONAL PRINCIPAL");
        for (l = 0; l <= 8; l++) {
            for (c = l + 1; c <= 9; c++) {
                System.out.println("" + n[l][c]);
            }
            for (t = 0; t <= l; t++) {
                System.out.println(t);
            }

        }

    }

}
