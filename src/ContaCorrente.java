public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, double saldoInicial) {
        super(cliente, saldoInicial, "Corrente");
    }

    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
