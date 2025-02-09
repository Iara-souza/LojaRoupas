package services;
import models.Produto;
import java.util.List;

public class EstoqueService {
    public static void verificarEstoque(List<Produto> produtos) {
        for (Produto p : produtos) {
            if (p.precisaRepor()) {
                System.out.println("⚠ ALERTA: Estoque baixo para " + p.getNome());
            }
        }
    }
}
