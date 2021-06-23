package bancoatt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class banco{

    public static void main(String[] args) {
        
       
        boolean continuar=true;
        boolean situacao,situacao2;
        String processo,nome;
        int nconta,numero,menu;
        double saldoinicial,valor;
        conta c=null;
        ArrayList lista = new ArrayList();

        Scanner sc = new Scanner(System.in);
        while(continuar==true){
            System.out.println("1.Abrir Conta");
            System.out.println("2.Sacar");
            System.out.println("3.Depositar");
            System.out.println("4.Transferir");
            System.out.println("5.Saldo");
            System.out.println("6.Excluir conta");
            menu = sc.nextInt();

            if(menu==1){
                System.out.println("Digite um numero para sua conta: ");
                numero = sc.nextInt();
                System.out.println("Digite o nome do titular dessa conta: ");
                nome = sc.next();
                System.out.println("Digite um valor para deposito inicial: ");
                saldoinicial = sc.nextDouble();
                situacao=true;
                c = new conta(numero,nome,saldoinicial,situacao);
                lista.add(c);
                System.out.println("Saldo atual: "+c.getSaldo());
            }
            if(menu==2){
                System.out.println("Digite o número da conta: ");
                nconta = sc.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        System.out.println("Digite o valor que deseja sacar: ");
                        valor = sc.nextDouble();
                        boolean saque_efetuado = c.sacar(valor);
                        if (saque_efetuado==true){
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println("Saldo atual: "+c.getSaldo());
                        }else{
                            System.out.println("Valor inválido!");
                        }
                        break;
                    }
                }
            }  

            if(menu==3){
                System.out.println("Digite o número da conta: ");
                nconta = sc.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        System.out.println("Digite o valor que deseja depositar: ");
                        valor = sc.nextDouble();
                        boolean deposito_efetuado = c.setSaldo(valor);
                        if(deposito_efetuado==true){
                            System.out.println("Depósito realizado com sucesso!");
                            System.out.println("Saldo atual: "+c.getSaldo());}
                        else{
                            System.out.println("Valor inválido.");
                        break;
                        }
                    }
                }
            }

            if(menu==4){
                System.out.println("Digite o número da conta de origem: ");
                nconta = sc.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta){
                        System.out.println("Digite o valor que deseja transferir: ");
                    }
                        


                }

            }

            if(menu==5){
                System.out.println("Digite o número da conta: ");
                nconta = sc.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        System.out.println("Saldo atual: "+ c.getSaldo());
                        System.out.println("Número da conta: "+c.getNumero());
                        System.out.println("Titular: "+c.getTitular());
                        if (c.situacao==true){
                            System.out.println("Conta aberta.");
                        }else{
                            System.out.println("Conta fechada.");
                        }
                        break;
            }
        }
    }
            if(menu==6){
                
                System.out.println("Digite o número da conta: \n Lembrando que você não pode estar devendo ou com dinheiro no banco");
                nconta = sc.nextInt();
                Iterator i = lista.iterator();
                while (i.hasNext()) {
                    c=(conta)i.next();
                    if(c.numero==nconta) {
                        situacao2=c.fecharConta();
                            if(situacao2==true){
                                System.out.println("Conta excluida com sucesso!");
                            }else{
                    System.out.println("Impossível completar ação pois ou você deve ou ainda tem dinheiro na conta.");
                    }
                    break;
                }
              }    
            }
            System.out.println("Deseja continuar?\n 1 para sim \n 2 para não");
            processo = sc.next();
            if(processo.equals("2")){
                continuar=false;
            }
        }  
    }
}