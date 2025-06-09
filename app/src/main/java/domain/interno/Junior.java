package domain.interno;

import java.util.Set;

public class Junior extends Clt {

    // Um orientador do tipo pleno
    public Junior(String nome, String cpf, String sobrenome,double salario, int cargahoraria, 
    String carteira_trabalho, Set<String> habilidades, String... emails){
        super(nome, cpf, sobrenome, salario, cargahoraria, carteira_trabalho, habilidades, emails);
    }


}
