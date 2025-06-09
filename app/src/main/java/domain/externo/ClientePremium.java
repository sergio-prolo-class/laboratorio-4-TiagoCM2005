package domain.externo;
import java.time.LocalDate;

import domain.interno.Senior;


public class ClientePremium extends Cliente{
    
    private double pagamento_mensal;
    private LocalDate data_inicial;
    private Senior representante;
    // Funcionario representante;

    public ClientePremium(String nome, String cpf, String sobrenome, String endereco, 
    String telefone, char genero, double pagamento_mensal, String... emails){
        super(nome, cpf, sobrenome, endereco, telefone, genero, emails);
        this.data_inicial = LocalDate.now();
        this.pagamento_mensal = pagamento_mensal;
    }

}
