import java.time.LocalDate;

public class Tese extends Publicacao {
    private int numPaginas;
    private String resumo;
    private LocalDate dataDefesa;
    private String instituicao;

    public Tese(String titulo, LocalDate dataPublicacao, Autor autor, int numPaginas, String resumo, LocalData dataDefesa, String instituicao, double valorMulta){
        super(titulo, dataPublicacao,publi,autor);
        this.numPaginas = numPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
        this.valorMulta = valorMulta;
        super.addAutor(autor);
    }

    public int getNumPaginas() {
        return this.NumPaginas;
     }
  
     public void setNumPaginas(int NumPaginas) {
        this.numPaginas = NumPaginas;
     }
  
     public String getResumo() {
        return this.resumo;
     }

     @Override
     public boolean addAutor(Autor autor){
      if(super.getAutores().size() < 1){
         return super.addAutor(autor);
      }
      return false;
    }
}