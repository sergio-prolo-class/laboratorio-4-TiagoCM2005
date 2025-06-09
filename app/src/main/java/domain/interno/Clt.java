package domain.interno;
import java.util.ArrayList;
import java.util.Set;

public class Clt extends Funcionario {
    private double salario;
    private int cargahoraria;
    private String carteira_trabalho;
    private Set<String> habilidades;

    public Clt(String nome, String cpf, String sobrenome,double salario, int cargahoraria, 
    String carteira_trabalho, Set<String> habilidades, String... emails){
        super(nome,cpf,sobrenome,emails);
        this.salario = salario;
        this.cargahoraria = cargahoraria;
        this.carteira_trabalho = carteira_trabalho;
        this.habilidades = habilidades;
    }
    
}
