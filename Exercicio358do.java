import java.util.Scanner;

public class Exercicio358do {
    public static void main(String[] args) {

        float precompra[] = new float[100];
        float prevenda[] = new float[100];
        float lucro;
        int a = 0;
        int lucromenor10 = 0;
        int lucromenor20 = 0;
        int lucromaior20 = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Preco de compra: ");
            precompra[a] = sc.nextFloat();
            System.out.println("Preco de venda: ");
            prevenda[a] = sc.nextFloat();

        } while (a < 100);
        a = 0;
        do {
            lucro = prevenda[a] - precompra[a];
            if (lucro < 10.0) {
                lucromenor10++;
            } else {
                if (lucro != 20.0) {
                    lucromenor20++;
                } else {
                    lucromaior20++;
                }

            }

        } while (a < 100);
        System.out.println("Total de mercadorias com lucro < 10%: " + lucromenor10);
        System.out.println("Total de mercadorias com lucro <= 10% <= lucro <= 20%: " + lucromenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + lucromaior20);
    }
}
