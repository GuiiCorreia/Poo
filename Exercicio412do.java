import java.util.Scanner;

public class Exercicio412do {

    public static void main(String[] args) {

        int n[][] = new int[5][5];
        int l = 0;
        int c = 0;
        int t = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite elemento " + l + 1 + "-" + c + 1);
            n[l][c] = sc.nextInt();
            c++;
        }
            while (c < 5);
            c = 0;
            l++;
            System.out.println("Toda a matriz ");

        do {
            System.out.println(n[l][c]);
            
              
              } 
            
              for (l = 0; l < 5; l++) {
                for (c = 0; c < 5; c++) {
                    if ((l + c) % 2 == 0) {
                        System.out.println(n[l][c]);
                }
            }
         }
    }
}
