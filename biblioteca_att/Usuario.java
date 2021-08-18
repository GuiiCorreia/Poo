import java.util.ArrayList;
import Livros.*;
import Publicacao.*;
import Usuario.*;


public abstract class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private int limEmprestimo;
   private int limRenovacao;
   private int qtdEmprestimos;


    public Usuario(String nome, String cpf, String email, String telefone, int limEmprestimo, int limRenovacao){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.limEmprestimo = limEmprestimo;
        this.limRenovacao = limRenovacao;
        this.qtdEmprestimos = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }
    public boolean fazerEmprestimo(){
        if(this.qtdEmprestimos < this.limEmprestimo || this.limEmprestimo < 0){
           this.qtdEmprestimos++;
           return true;
        }else{
           return false;
        }
     }
     public boolean devolverEmprestimo(){
        this.qtdEmprestimos--;
        return true;
     }
  
     public int getlimEmprestimo() {
        return this.limEmprestimo;
     }
  
     public int getlimRenovacao() {
        return this.limRenovacao;
     }
}
