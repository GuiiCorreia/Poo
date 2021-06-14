import java.util.Scanner;

public class Exercicio428 {

    public static void main(String[] args) {

        int dados[][] = new int[10][4];
        int l, codigo, pos, aux;

        Scanner sc = new Scanner(System.in);

        for (l = 0; l < 10; l++) {
            System.out.println("digite matricula no formato aascccnnn: ");
            dados[l][0] = sc.nextInt();
            aux = dados[l][0] / 1000000;
            aux = dados[l][0] - aux * 1000000;
            dados[l][2] = aux / 1000;

            System.out.println("digite sexo (0 fem 1 masc): ");
            dados[l][1] = sc.nextInt();

            System.out.println("digite CR do aluno: ");
            dados[l][3] = sc.nextInt();
        }

        System.out.println("digite codigo do curso: ");
        codigo = sc.nextInt();
        pos = 0;

        for (l = 0; l < 10; l++) {
            if (dados[l][21] == codigo && dados[l][1] == 0) {
                pos = l;
            } else {
                if (dados[l][31] > dados[pos][3]) {
                    pos = l;
                }
            }
        }

        System.out.println("aluna premiada matricula: " + dados[pos][0] + "teve CR: " + dados[pos]);

    }

}
