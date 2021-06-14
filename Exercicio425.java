import java.util.Scanner;

public class Exercicio425 {

    public static void main(String[] args) {

        int l, c, d;
        int qtde[][] = new int[50][3];
        String nome[] = new String[50];

        Scanner sc = new Scanner(System.in);

        for (l = 0; l < 50; l++) {
            System.out.println("digite nome da " + l + 1 + " planta: ");
            nome[l] = sc.nextLine();

            System.out.println("digite quantidade em estoque: ");
            qtde[l][0] = sc.nextInt();

            System.out.println("digite quantidade ideal: ");
            qtde[l][1] = sc.nextInt();

            if (qtde[l][0] < qtde[l][1]) {
                qtde[l][2] = qtde[l][1] - qtde[l][0];
            } else {
                qtde[l][2] = 0;
            }
        }

        System.out.println("total de compras");

        for (l = 0; l < 5; l++) {
            System.out.println(nome[l] + "--" + qtde[l][2]);
        }

    }

}
