package domain.interno;

import java.time.*;

public class Funcionario extends Pessoa{
    private static int countTotal;
    private LocalDate inicio_contrato;
    private int id;
    private double salario;

    static{
        countTotal = 0;
    }

    public Funcionario(String nome, String cpf, String sobrenome,double salario, String... emails){
        super(nome, cpf, sobrenome, emails);
        this.inicio_contrato = LocalDate.now();
        this.id = countTotal++;
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Funcionario f)) return false;
        return id == (f.id);
    }

    @Override
    public int hashCode(){ 
        return id;}
    
}
