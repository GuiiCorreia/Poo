import java.util.ArrayList;
import Livros.*;
import Publicacao.*;

public abstract class Publicacao {
  private String titulo;
  private Date dataPublicacao;
  private long dataEntrega;
  private ArrayList<Publicacao> publi = new ArrayList<Publicacao>();
  private ArrayList<Autores> autor = new ArrayList<Autores>();

  public Publicacao(String titulo, Date dataPublicacao, ArrayList<Publicacao> publi, ArrayList<Autores> autor){
      this.titulo = titulo;
      this.dataPublicacao = dataPublicacao;
      this.publi = publi;
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

  public void setAutor(Autores autor) {
      this.autor.add(autor);
  }

  public ArrayList<Autor> getAutor() {
    return autor;
  }

  
}






