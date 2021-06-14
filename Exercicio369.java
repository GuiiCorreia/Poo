import java.util.Scanner;

public class Exercicio369 {

    public static void main(String[] args) {

        int mesa[] = new int[30];
        int qtde[] = new int[30];
        int i, lugares, codigos, lugmesa;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 30; i++) {
            mesa[i] = 100 + i;
            qtde[i] = 5;
        }

        lugares = 150;
        System.out.println("Entre com codigo (100 - 129) ou 0 para terminar: ");
        codigos = sc.nextInt();

        while (codigos > 0 && lugares != 0) {
            i = 0;
            while (codigos != mesa[i] && i < 29) {
                i++;
            }

            if (codigos == mesa[i]) {
                System.out.println("Quantidade de lugares a reservar: ");
                lugmesa = sc.nextInt();

                if (qtde[i] >= lugmesa) {
                    qtde[i] = qtde[i] - lugmesa;
                    lugares = lugares - lugmesa;
                } else {
                    System.out.println("Nao ha lugares a reservar");
                    System.out.println("Codigo de mesa invalido");
                    codigos = sc.nextInt();
                }
            }
            if (lugares == 0) {
                System.out.println("Lotacao esgotada");
            } else {
                System.out.println("Lugares vagos");
                for (i = 0; 1 < 30; i++) {
                    if (qtde[i] != 0) {
                        System.out.printf("\n Mesa:" + mesa[i] + "\n Total lugares:" + qtde[i]);

                    }

                }
            }
        }

    }

}
