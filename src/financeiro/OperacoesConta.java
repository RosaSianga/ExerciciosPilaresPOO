package financeiro;

public interface OperacoesConta {
    void depositar(String conta, double valor);
    void sacar(double valor);
    double consultarSaldo();
    void transferir(String conta, double valor);
}
