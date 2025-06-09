package domain.externo;
import domain.interno.Pessoa;
import java.time.*;

public class Cliente extends Pessoa{
    private static int countTotal;

    static{
        countTotal = 0;
    }

    private int id;
    private String endereco;
    private String telefone;
    private char genero;
    private LocalDate data_cadastro;

    public Cliente(String nome, String cpf, String sobrenome, String endereco, 
    String telefone, char genero, String... emails){
        super(nome, cpf, sobrenome, emails);
        this.telefone = telefone;
        this.genero = genero;
        this.endereco = endereco;
        this.data_cadastro = LocalDate.now();
        this.id = ++countTotal;
    }
}
