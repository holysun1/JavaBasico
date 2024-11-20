import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    protected List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criarConta (String nomeTitular, String cpfTitular, double saldoInicial, String tipoConta){
        Cliente novoCliente = new Cliente(nomeTitular, cpfTitular);
        Conta novaConta;
        if(tipoConta.equalsIgnoreCase("corrente")){
            novaConta = new ContaCorrente(novoCliente,saldoInicial);
        } else if (tipoConta.equalsIgnoreCase("poupança")) {
            novaConta = new ContaPoupanca(novoCliente,saldoInicial);
        } else{
            System.out.println("Tipo de conta inválido. Use 'corrente' ou 'poupança'.");
            return;
        }
        contas.add(novaConta);
//        System.out.println("Conta criada com sucesso!");
//        System.out.println(novaConta);
    }

    public void listarContas(){
        System.out.println("Contas do Banco" + nome + ":\n");
        for(Conta conta: contas){
            System.out.println(conta);
        }
        System.out.println("\n");
    }


}


