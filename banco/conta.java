 // criei as classes com os dados que eu quero, usuario, cpf, telefone, saldo e o endereço
 // e coloquei mais ou menos por enquanto oq cada coisa vai fazer e relacionei eles
 // pre configurei atos como sacar, depositar e fazer transferencia
 // e coloquei uns calculos para esses dados acima sempre ficarem atualizados de acordo
 // com oq o usuario quer fazer 

class conta {

    String usuario;
    double cpf;
    double telefone;
    double saldo;
    String endereco;

    void dados(String usuario, double cpf, double telefone, double Saldo, String endereco) {

        this.usuario = usuario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.saldo = saldo;
        this.endereco = endereco;

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    void depositar(Double quantia) {
        this.saldo += quantia;
    }

    void saque(Double quantidade) {
        Double novoSaldo = this.saldo = quantidade;
        this.saldo = novoSaldo;
    }

    void transferencia(conta destinatario, double quantidade) {
        this.saldo = this.saldo - quantidade;
        destinatario.saldo = destinatario.saldo = quantidade;
    }

    public void getCpf(double cpf) {
        this.cpf = cpf;

    }

    public void getTelefone(double telefone) {
        this.telefone = telefone;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
