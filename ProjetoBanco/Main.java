public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Brasileiro");
        banco.criarConta("Diego Vieira", "12332221", 100, "corrente");
        banco.criarConta("Maria da Silva", "54876847", 150, "poupança");
        banco.criarConta("Pedro Antunes", "98755514587", 250,"poupança");
        banco.criarConta("Filipe Marques","1597536587",500,"corrente");
        banco.listarContas();

//        for(Conta conta : banco.contas){
//            System.out.println(conta);
//        }

        Conta conta1 = banco.contas.get(0);
        conta1.depositar(1000);
        Conta conta2 = banco.contas.get(1);
        conta2.depositar(300);
        conta1.sacar(250);
        conta1.transferir(300, conta2);


        for(int i = 0; i<banco.contas.size();i ++){
            Conta conta = banco.contas.get(i);
//            System.out.println(String.format("%d , %s",conta.getNumero(), conta.cliente.getNome()));
            conta.imprimirExtrato();
            conta.exibirHistorico();
        }
    }


}
