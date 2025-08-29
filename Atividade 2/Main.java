public class Main {
    public static void main(String[] args) {
        // Main apenas imprime e chama o processamento
        System.out.println("=== Sistema de Gerenciamento Bancário ===");
        System.out.println("Demonstração dos princípios ISP e Low Coupling");
        System.out.println();
        
        Conta.processarContas();
        
        System.out.println();
        System.out.println("=== Fim da Demonstração ===");
    }
}