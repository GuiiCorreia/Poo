// criei a interface inicial e tenho q relacionar ela com o conta.java
// nao consegui fazer tudo por enquanto, mas estou pegando a ideia de 
// orientada a objetos, vejo q isso ajuda muito e facilita no entendimento
// e organização do codigo e praticando vou conseguir completar o objetivo 
// dessa atividade

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
