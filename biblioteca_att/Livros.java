import java.util.ArrayList;
import Livros.*;
import Publicacao.*;

public class Livros {
private String titulo, editora, ISBN;
ArrayList autores;

public Livros(String titulo, String autores, String editora, String ISBN, double valorMulta) {
    this.titulo = titulo;
    this.autores = new ArrayList<String>();
    this.autores.add(autores);
    this.editora = editora; 
    this.ISBN = ISBN;
    this.valorMulta = valorMulta;
    setLimiteDias(3);
}

public void setTitulo(String titulo) {
    this.titulo=titulo; 
}
public String getTitulo() {
    return titulo; 
}

public void setAutores(int ind,String autores) { 
    this.autores.set(ind,autores);
} 

public ArrayList getAutores() {
    return autores; 
}

public void setEditora(String editora) {
    this.editora=editora; 
}

public String getEditora() {
    return editora; 
}

public void setISBN(String iSBN) {
    ISBN = iSBN;
}
public String getISBN() {
    return ISBN;
}

}