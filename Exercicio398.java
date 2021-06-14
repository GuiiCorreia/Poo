import java.util.Scanner;

public class Exercicio398 {

    public static void main(String[] args) {

        int k, codi, codigo, t, i, quantidade, aux;
        int cod[] = new int[50];
        int quant[] = new int[50];
        float preco[] = new float[50];
        float venda, geral, auxp;

        Scanner sc = new Scanner(System.in);

        k = 0;
        geral = 0;

        System.out.println("Digite o codigo do produto ou O para acabar: ");
        codi = sc.nextInt();

        while (k < 50 && codi != 0) {
            cod[k] = codi;
            System.out.println("Digite a quantidade do produto: ");
            quant[k] = sc.nextInt();
            System.out.println("Digite o preco do produto: ");
            preco[k] = sc.nextInt();
            k++;
            System.out.println("Digite o codigo do produto ou 0 para acabar: ");
        }

        // nao consegui achar a questao inteira, no pdf ela esta incompleta

    }

}
