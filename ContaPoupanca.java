package Entities;

class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular) {
        super(numero, "Poupança", titular);
    }

    
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + ". Saldo atual: R$" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente de R$" + valor);
        }
    }

    public void solicitarEmprestimo(double valor) {
        System.out.println("Empréstimo não disponível.");
    }
}
