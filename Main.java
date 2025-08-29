import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaCorrente());
        contas.add(new ContaPoupanca());
        ServicoBancario servico = new ServicoBancario();
        servico.executarProcessamentoMensal(contas);
        System.out.println("Processamento realizado!");
    }
}