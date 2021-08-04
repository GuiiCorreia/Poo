import java.util.ArrayList;
import Livros.*;
import Publicacao.*;


public class Autores {
    private String nome;
    private String titulacao;

    public Autores(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    public String getTitulacao() {
        return titulacao;
    }

}
