package domain.interno;

import java.util.*;

public class Pessoa {

    private String nome;
    private String cpf;
    private String sobrenome;
    private Set<String> emails;

    public Pessoa(String nome, String cpf, String sobrenome, String... emails){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.emails = new HashSet<>(Arrays.asList(emails));

    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Pessoa p)) return false;
        return cpf.equals(p.cpf);
    }
    
    @Override
    public int hashCode(){
        return cpf.hashCode();
    }
}
