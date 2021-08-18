import java.time.LocalDate;
import java.time.Period;

import javax.naming.LimitExceededException;

public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;
    private double valorMulta;
    private int qtdEmprestimos;
    private int qtdRenovacoes;

    public boolean fazerEmprestimo(Publicacao publicacao, Usuario usuario) throws LimitExceededException {
        if (publicacao.isDisponivel()) {
            if (usuario.fazerEmprestimo()) {
                this.id = ++this.contador;
                this.usuario = usuario;
                this.publicacao = publicacao;
                this.dataEmprestimo = LocalDate.now();
                this.dataDevolucao = dataDevolucao.plus(Period.ofDays(7));
                this.valorMulta = 0;
                this.qtdRenovacoes = 0;
            } else {
                // System.out.printf("Não pode pegar novo emprestimo");
                throw new MaxEmprestimosUsuarioException("Não pode pegar novo emprestimo");
            }
        } else {
            // System.out.println("Nao disponivel");
            throw new MaxEmprestimosUsuarioException("Nao disponivel");
        }
    }

    public boolean devolverEmprestimo() {
        this.dataDevolucao = "19/08/2021";
        this.publicacao.devolver();
        this.usuario.devolverEmprestimo();
        System.out.println("Emprestimo realizado");
        this.calcularMulta();
        System.out.println("A multa é de:" + this.valorMulta);
        return true;
    }

    public boolean renovarEmprestimo() {
        this.qtdEmprestimos++;
        this.dataDevolucao = "27/08/2021";
        System.out.println("Emprestimo renovado");
        return true;
    }

    public void calcularMulta() {
        int qtdRenovacoes = this.qtdEmprestimos - this.usuario.limRenovacao();
        if (qtdRenovacoes > 0) {
            this.valorMulta = qtdRenovacoes * this.publicacao.valorMulta;
        } else {
            this.valorMulta = 0;
        }

    }

    public int getId() {
        return this.id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Publicacao getPublicacao() {
        return this.publicacao;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorMulta() {
        return this.valorMulta;
    }

    public int getqtdEmprestimos() {
        return this.qtdEmprestimos;
    }

    public int getQtdRenovacoes() {
        return this.qtdRenovacoes;
    }

}