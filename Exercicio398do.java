import java.util.Scanner;

public class Exercicio398do {

    public static void main(String[] args) {

        int k, codi, t, i, quantidade, aux;
        int codigo = 1;
        int cod[] = new int[50];
        int quant[] = new int[50];
        float preco[] = new float[50];
        float venda, geral, auxp;

        Scanner sc = new Scanner(System.in);

        k = 0;
        geral = 0;

        System.out.println("Digite o codigo do produto ou O para acabar: ");
        codi = sc.nextInt();

        do {
            cod[k] = codi;
            System.out.println("Digite a quantidade do produto: ");
            quant[k] = sc.nextInt();
            System.out.println("Digite o preco do produto: ");
            preco[k] = sc.nextInt();
            k++;
            System.out.println("Digite o codigo do produto ou 0 para acabar: ");
        }
    }

}
