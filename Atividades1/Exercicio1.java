// primeiro vc escreve o valor da gasolina, na mesma linha mesmo ou na de baixo, coloca o valor 
// do alcool e entao tera seu resultado

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        double gasolina;
        double alcool;
        double resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primeiro o  valor primeiro da gasolina" + "\n" + "Depois o valor do alcool");

        gasolina = sc.nextDouble();
        alcool = sc.nextDouble();

        resultado = alcool / gasolina;

        if (resultado <= 0.7) {
            System.out.println("Coloque gasolina pois compensa mais = " + resultado);
        }

        else {
            System.out.println("Coloque alcool pois compensa mais = " + resultado);

        }

    }
}