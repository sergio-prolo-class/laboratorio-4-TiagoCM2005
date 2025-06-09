package domain.interno;

import java.util.HashSet;
import java.util.Set;

public class Pleno extends Clt{
    private Set<Junior> orientados;
    private Set<Senior> chefes;

    public Pleno(String nome, String cpf, String sobrenome,double salario, int cargahoraria, 
    String carteira_trabalho, Set<String> habilidades, String... emails){
        super(nome, cpf, sobrenome, salario, cargahoraria, carteira_trabalho, habilidades, emails);
        orientados = new HashSet<>();
    }

    public boolean setOrientado(Junior junior){
        return orientados.add(junior);
    }
    
}
