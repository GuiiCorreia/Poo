import java.util.Scanner;

public class Exercicio400 {

    public static void main(String[] args) {

        int leitos[] = new int[50];
        int nd[] = new int[50];
        int i,k,chave,quarto,op;
        String sit[] = new String [50];
        String din[] = new String [50];
        String dout[] = new String [50];
        String nome[] = new String [50];
        String tel[] = new String [50];
        String resp,respl,respo,nomep; 
        float precos[] = new float[50];
        float despesas[] = new float[50];
        float valor,total;

        Scanner sc = new Scanner(System.in);

        chave = 0;


        do{
            System.out.println("\nHotel Fazenda Sucesso");
            System.out.println("l - Cadastro de quartos");
            System.out.println("2 - Listar todos os quartos");
            System.out.println("3 - Listar os quartos ocupados");
            System.out.println("4 - Alugar/Reservar quarto");
            System.out.println("5 - Entrar despesas extras");
            System.out.println("6 - Calcular a despesa do quarto");
            System.out.println("7 - Sair");
            System.out.println();

            System.out.print("Opção: ");
            op = sc.nextInt();

            if (op == 1) {
                if (chave == 1) {
                    System.out.println("Atenção! Dados já cadastrados ");
                } else{
                    do {
                    System.out.println("Quantidade de leitos para o quarto: " + (i + 1) + ": ");
                   leitos[i] =  sc.nextInt();
                   System.out.println("Preço do quarto: ");
                   precos[i] =  sc.nextFloat();
                   sit[i] = "L";
                   nd[i] = 0;
                   despesas[i] = 0;
                   din[i] = "XXXX";
                   dout[i] = "XXXX";
                   nome[i] = "";
                   tel[i] = "";
                    i++;
        }
                while (i < 50);
                chave = 1;
        }
    }
                else if (true) {
                if (op == 2) {
                if (chave == 0) {
                System.out.println("Escolha a opção 1.");
        


    

    }


    }

        }
