import java.util.ArrayList;
import Livros.*;
import Publicacao.*;

public abstract class Publicacao {
  private String titulo;
  private LocalDate dataPublicacao;
  private LocalDate dataEntrega;
  private ArrayList<Publicacao> publi;
  private ArrayList<Autores> autor;
  private double valorMulta;
  private boolean emprestada;

  public Publicacao(String titulo, LocalDate dataPublicacao, double valorMulta){
      this.titulo = titulo;
      this.dataPublicacao = dataPublicacao;
      this.publi = publi;
      this.autor = autor;
      this.valorMulta = valorMulta;
      this.emprestada = true;
    }
  
  public void setTitulo(String titulo) {
      this.titulo = titulo;
  }
  public String getTitulo() {
      return titulo;
  }

  public ArrayList<Publicacao> getPubli() {
    return publi;
  }

  public void setDataPublicacao(Date DataPublicacao) {
    dataPublicacao = DataPublicacao;
  }

  public Date getDataPublicacao() {
    return DataPublicacao;
  }

  public void setDataEntrega(long dataEntrega) {
    this.dataEntrega = dataEntrega;
  }
  public long getDataEntrega() {
    return dataEntrega;
  }

  public ArrayList<Autor> getAutor() {
    return autor;
  }

  public boolean addAutor(Autor autor){
      return this.autor.add(autor);
  }
  public boolean removeAutor(Autor autor){
    return this.autor.remove(autor);
  }
 
  public double getValorMulta(){
   return this.valorMulta;
 }
  public void setValorMulta(){
    this.multa = multa;
  }
  public boolean getEmprestada(){
    return this.emprestada;
  }
  public boolean isEmprestada(){
    return this.emprestada;
  }
}






