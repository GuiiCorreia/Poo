import java.util.ArrayList;
import Livros.*;
import Publicacao.*;
import Usuario.*;
 

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
 

    public Usuario(String nome, String cpf, String email, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
       
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

}
