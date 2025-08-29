import java.util.List;

public class ServicoBancario {
    
    // GRASP Low Coupling: Depende apenas da interface, não de classes concretas
    public void executarProcessamentoMensal(List<ContaBancaria> contas) {
        for (ContaBancaria conta : contas) {
            
            // Operações básicas que todas as contas têm
            conta.depositar(100);
            conta.sacar(50);
            System.out.println("Saldo atual: " + conta.getSaldo());
            
            // Verifica capacidades específicas (baixo acoplamento)
            if (conta instanceof ContaTributavel) {
                System.out.println("- Aplicando tarifa em conta tributável");
                ((ContaTributavel) conta).cobrarTarifa(10);
            }
            
            if (conta instanceof ContaRentavel) {
                System.out.println("- Aplicando juros em conta rentável");
                ((ContaRentavel) conta).renderJuros(0.5);
            }
            
            System.out.println("---");
        }
    }
}