
public class UsuarioComum extends Usuario{
    private int limEmprestimo = 5;
    public UsuarioComum(String nome, String cpf, String email, String telefone){
        super(nome, cpf, email, telefone, 5, 5);
    }
    public void setLimiteEmprestimo(int limEmprestimo) {
        this.limEmprestimo = limEmprestimo;
    }
    public int getLimEmprestimo() {
        return limEmprestimo;
    }
}