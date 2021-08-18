import java.util.ArrayList;
import Livros.*;
import Publicacao.*;
import Usuario.*;


public class UsuarioVip extends Usuario{
    public UsuarioVip(String nome, String cpf, String email, String telefone){
        super(nome, cpf, email, telefone, -1, 5);
    }
}