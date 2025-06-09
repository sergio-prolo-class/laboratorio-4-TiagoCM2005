package domain;
import java.time.*;


public class ClientePremium extends Cliente{
    
    private double pagamento_mensal;
    private LocalDate data_inicial;
    // Funcionario representante;

    public ClientePremium(String nome, String cpf, String sobrenome, String endereco, 
    String telefone, char genero, double pagamento_mensal, String... emails){
        super(nome, cpf, sobrenome, endereco, telefone, genero, emails);
        this.data_inicial = LocalDate.now();
        this.pagamento_mensal = pagamento_mensal;
    }


}
