import java.util.Scanner;

public class Exercicio360 {

    public static void main(String[] args) {

        int ultdia[] = new int[12];
        int data, i, dia, mes;
        String signo[] = new String[12];

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 12; i++) {
            System.out.println("Digite signo: ");
            signo[i] = sc.nextLine();

            System.out.println("Digite ultimo dia:");
            ultdia[i] = sc.nextInt();
        }

        System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
        data = sc.nextInt();

        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;
            }

            System.out.println("Signo: " + signo[mes]);
            System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
            data = sc.nextInt();

        }

    }

}
