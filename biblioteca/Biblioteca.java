import java.util.ArrayList;

public class Biblioteca {
    private String endereco;
    private String nome;
    private ArrayList<Publicacao> publica;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Usuario> usuarios;
    


    public Biblioteca(String nome, String endereco) {
        this.endereco = endereco;
        this.nome = nome;
        this.publica = new ArrayList<Publicacao>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.usuarios = new ArrayList<Usuario>();
        
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

    public boolean addPublicacao(Publicacao publicacao){
        this.publica.add(publicacao);
        return true;
    }
     
    public boolean removePublicacao(Publicacao publicacao){
        this.publica.remove(publicacao);
        return true;
    } 

    public boolean addEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
        return true;
     }
     
     public boolean removeEmprestimo(Emprestimo emprestimo){
        this.emprestimos.remove(emprestimo);
        return true;
     }
  
     public Emprestimo buscarEmprestimo(int id){
        for(Emprestimo emprestimo: this.emprestimos){
           if(emprestimo.getId() == id){
              return emprestimo;
           }
        }
        return null;
     }
}


