import java.util.ArrayList;
import Livros.*;
import Publicacao.*;

public class Biblioteca {
    private String endereco;
    private String nome;
    private ArrayList<Publicacao> publica = new ArrayList<Publicacao>();


    public Biblioteca(String nome, String endereco) {
        this.endereco = endereco;
        this.nome = nome;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void novaPublicacao(Publicacao publica){
        publi.add(publica);
    
    }

}


