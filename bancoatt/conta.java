package bancoatt;

public class conta {
    public int numero;
    private String titular;
    private double saldo;
    public boolean situacao;

    public conta(int numero, String nome, double saldo, boolean situacao) {
        this.numero = numero;
        this.titular = nome;
        this.saldo = saldo;
        this.situacao = situacao;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, conta conta) {
        if (this.sacar(valor)) {
            conta.sacar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean setSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean getSituacao() {
        return situacao;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public boolean fecharConta() {
        if (this.saldo > 0 || this.saldo < 0) {
            return false;
        } else {
            this.situacao = false;
            return true;
        }
    }

}