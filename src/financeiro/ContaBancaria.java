package financeiro;

public class ContaBancaria implements OperacoesConta{

    private String numeroConta;
    private double saldo;

    //Construtor
    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    //Encapsulamento
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Metodos
    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Deposito Realizado com sucesso no valor de " + valor);
        consultarSaldo();
        System.out.println("-------------------------");

    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque Realizado com sucesso no valor de " + valor);
            consultarSaldo();
            System.out.println("-------------------------");
        } else {
            System.out.println("Saque recusado - Saldo é insuficiente para sacar o valor de " + valor);
            System.out.println("-----------------------------");
        }
    }

    @Override
    public double consultarSaldo() {
        System.out.println("Saldo da Conta bancária");
        System.out.println("Conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("-----------------------------");
        return saldo;
    }

    @Override
    public void transferir(ContaBancaria conta, double valor) {

        sacar(2000.00);
        conta.depositar(2000.00);
        conta.consultarSaldo();

    }

}
