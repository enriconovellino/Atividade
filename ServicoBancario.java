import java.util.List;

public class ServicoBancario {
    public void executarProcessamentoMensal(List<ContaBancaria> contas) {
        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaTributavel) {
                ((ContaTributavel) conta).cobrarTarifa(10);
            }
            if (conta instanceof ContaRentavel) {
                ((ContaRentavel) conta).renderJuros(0.5);
            }
        }
    }
}