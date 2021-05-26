import java.util.Scanner;

public class banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu;

        conta conta1 = new conta();

        do {
            System.out.println("1.Abrir Conta");
            System.out.println("2.Sacar");
            System.out.println("3.Depositar");
            System.out.println("4.Saldo");
            System.out.println("5.Sair");
            menu = sc.nextInt();

        }

        while (menu != 5);

    }

}
