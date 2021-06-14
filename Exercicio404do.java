import java.util.Scanner;

class Exercicio398do {
  public static void main(String[] args) {
    int n[][] = new int[10][10];
        int l = 0;
        int c = 0;
        int t = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" Entre com elemento linha " + l + 1 + " coluna " + c + 1);
            n[l][c] = sc.nextInt();


            c++;
          } while (c <= 9);

          c = 0;
          l++;
        }while(l<=9);

    System.out.println("ACIMA DA DIAGONAL PRINCIPAL.");
}
