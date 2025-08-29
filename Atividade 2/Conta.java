import java.util.*;

public class Conta {
    
    // GRASP Low Coupling: Esta classe gerencia as instâncias sem depender de implementações específicas
    public static List<ContaBancaria> criarContas() {
        List<ContaBancaria> contas = new ArrayList<>();
        
        // Criamos objetos concretos, mas retornamos como interfaces (baixo acoplamento)
        contas.add(new ContaCorrente());
        contas.add(new ContaPoupanca());
        
        return contas; // Retorna a abstração, não as implementações
    }
    
    // GRASP Low Coupling: Método que demonstra processamento sem conhecer tipos específicos
    public static void processarContas() {
        List<ContaBancaria> contas = criarContas();
        ServicoBancario servico = new ServicoBancario();
        
        System.out.println("=== Processamento das Contas ===");
        servico.executarProcessamentoMensal(contas);
        System.out.println("Processamento concluído!");
    }
}
