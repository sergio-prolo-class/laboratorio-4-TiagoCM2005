package domain.interno;

import java.util.HashSet;
import java.util.Set;

public class Senior extends Clt {

    private double bonificao;
    private Set<Pleno> subordinados;
    public Senior(String nome, String cpf, String sobrenome,double salario, int cargahoraria, 
    String carteira_trabalho, Set<String> habilidades, double bonificao,String... emails){

        super(nome, cpf, sobrenome, salario, cargahoraria, carteira_trabalho, habilidades, emails);
        this.bonificao = bonificao;
        this.subordinados = new HashSet<>();
    }

    


}
