
public class UsuarioNormal extends Usuario{
    private int limiteEmprestimo = 5;
    public UsuarioComum(String nome, String cpf, String email, String telefone){
        //private String nome;
        //private String cpf;
        //private String email;
        //private String telefone;
        super(nome, cpf, email, telefone);
    }
    public void setLimite(int limiteEmprestimo) {
        this.limite = limiteEmprestimo;
    }
    public int getLimite() {
        return limiteEmprestimo;
    }
}
