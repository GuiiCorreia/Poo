// digite uma sequencia quanto em linha quanto coluna que ele vai te mandar essa listao ao 
// contrario, os dados invertidos
// a logica usada foi criar um vetor e mostrar ele invertido
// tentei fazer de uma forma mais organizada, mas nao funcionou do jeito que eu queria

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite uma sequencia de 10 itens: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("A sequencia invertida é: " + vetor[i]);
        }

    }
}
