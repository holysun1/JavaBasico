import java.util.ArrayList;
import java.util.Date;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected ArrayList<Transacao> historico;
    protected String tipoConta;

    public Conta(Cliente cliente, double saldoInicial, String tipoConta) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = saldoInicial;
        this.tipoConta = tipoConta;
        this.historico = new ArrayList<>();
        historico.add(new Transacao("Abertura de Conta", saldoInicial));
    }

    public String toString(){
        return String.format(" Titular: %s, Número: %d, CPF: %s, Saldo: R$ %.2f , Tipo de Conta: %s \n", cliente.getNome(),numero, cliente.getCpf(),saldo, tipoConta );
    }

    class Transacao {
        protected String tipo;
        protected Date data;
        protected double valor;
        public Transacao(String tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
            this.data = new Date();
        }

        public String toString() {
            return String.format("[%s] Tipo: %s | Valor: R$ %.2f", data, tipo, valor);
        }
    }

    public void sacar ( double valor){
        if(valor <= saldo) {
            saldo -= valor;
            historico.add(new Transacao("Saque", valor));
        } else {
            System.out.println("Saldo insuficiente para saque! \nSaldo disponível: R$ " + String.format("%.2f",saldo));
        }
    }
    public void depositar ( double valor){
            saldo += valor;
            historico.add(new Transacao("Depósito", valor));
    }
    public void transferir ( double valor, Conta contaDestino) {
            if (valor <= saldo) {
                saldo -= valor;
                contaDestino.saldo += valor;
                historico.add(new Transacao("Transferência para Conta: " + contaDestino.cliente.getNome(), valor));
                contaDestino.historico.add(new Transacao("Transferência Recebida de: " + this.cliente.getNome() , valor));
            } else {
                System.out.println("Saldo insuficiente para transferência");
            }
        }
        protected void imprimirExtrato(){
            System.out.println("========================");
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
            System.out.println("========================");
        }

        protected void exibirHistorico(){
            System.out.println("========================");
            System.out.println("Histórico de Transações:");
            for(Transacao t: historico){
                System.out.println(t);
            }
            System.out.println("Saldo atual: R$ " + String.format("%.2f",saldo));
            System.out.println("========================");
        }

        public int getAgencia () {
        return agencia;
    }

        public int getNumero () {
        return numero;
    }

        public double getSaldo () {
        return saldo;
    }

        public String getTipoConta() {
        return tipoConta;
    }



}


