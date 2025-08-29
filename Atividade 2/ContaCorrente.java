public class ContaCorrente implements ContaBancaria, ContaTributavel {
    @Override
    public void depositar(double valor) {}
    @Override
    public void sacar(double valor) {}
    @Override
    public double getSaldo() { return 0; }
    @Override
    public void cobrarTarifa(double valor) {}
}