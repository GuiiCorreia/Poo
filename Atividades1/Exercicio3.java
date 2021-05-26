// vai fazer a sequencia de fibonacci do valor que o usuario digitar
// nao consegui chegar em uma logica que mostrasse apenas o resultado
// entao ele vai mostrar todos os valores do processo, e o ultimo sera o resultado
// do fibonacci do numero desejado

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] Args_) {

        int a = 0;
        int b = 1;
        int c;
        int dado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        dado = sc.nextInt();

        for (int i = 0; dado >= i; i++) {
            System.out.println(a);
            c = a;
            a = a + b;
            b = c;
        }

    }

}
