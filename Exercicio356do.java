import java.util.Scanner;

public class Exercicio356do {

    public static void main(String[] args) {

        int l = 0;
        int c = 0;
        int t = 0;
        int media[] = new int[15];
        String nomes[] = new String[15];
        String sit[] = new String[15];
        float pr1[] = new float[15];
        float pr2[] = new float[15];

        Scanner sc = new Scanner(System.in);

        do {
            System.out.printf("Digite: ", l + 1, "nome: ");
            nomes[l] = sc.nextLine();
            while (nomes[l].length() > 30) {
                System.out.println("Nomes com ate 30 caracteres");
                System.out.printf("Digite ", l + 1, " nome:");
                nomes[l] = sc.nextLine();
            }

            t = 30 - nomes[l].length();
            do {
                {
                    nomes[l] = nomes[l].concat(" ");
                }
                c++;
            } while (c <= t);
            nomes[l] = nomes[l].concat("");
            System.out.println("Digite nota 1: ");
            pr1[l] = sc.nextFloat();
            System.out.println("Digite nota 2: ");
            pr2[l] = sc.nextFloat();
            media[l] = (int) (pr1[l] + pr2[l] / 2 + 0.0001);

            System.out.println(media[l]);
            if (media[l] > 5) {
                sit[l] = "AP";
            } else {
                sit[l] = "RP";
            }

            l++;
        } while (l <= 14);

        System.out.println("Relação final");
        for (l = 0; l <= 14; l++) {
            System.out.println(l + 1 + pr1[l] + pr2[l] + media[l] + sit[l]);
            l++;

        }
    }
}