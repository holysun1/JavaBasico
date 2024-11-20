public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, double saldoInicial) {
        super(cliente, saldoInicial, "Poupança");
    }
    public void imprimirExtrato(){

        System.out.println(" === Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
    }

