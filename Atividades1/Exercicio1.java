// primeiro vc escreve o valor da gasolina, na mesma linha mesmo ou na de baixo, coloca o valor 
// do alcool e entao tera seu resultado
// a logica foi pegar os valores, fazer o calculo e de acordo com o calculo
// aparecer uma mensagem de qual combustivel compensa mais de acordo com o resultado menor ou mair
// que 0.7

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
