// pode colocar o valor que voce quiser sacar, como se fosse em um caixa eletronico
// quando o valor for digitado, vai aparecer as notas e a quantidade delas que voce
// vai precisar para chegar ao valor desejado
// 

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que você deseja sacar");

        int calculo = sc.nextInt();
        int nota_50 = 50;
        int nota_10 = 10;
        int nota_5 = 5;
        int nota_1 = 1;

        if (calculo >= 1) {
            if (calculo >= nota_50) {
                nota_50 = calculo / 50;
                calculo = calculo % 50;
                System.out.println(nota_50 + " notas de 50 R$");
            }

            if (calculo >= nota_10) {
                nota_10 = calculo / 10;
                calculo = calculo % 10;
                System.out.println(nota_10 + " notas de 10 R$");
            }
            if (calculo >= nota_5) {
                nota_5 = calculo / 5;
                calculo = calculo % 5;
                System.out.println(nota_5 + " notas de 5 R$");
            }
            if (calculo >= nota_1) {
                nota_1 = calculo / 1;
                calculo = calculo % 1;
                System.out.println(nota_1 + " notas de 1 R$");
            }
        }

    }
}