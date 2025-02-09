package services;
import models.Venda;
import repository.FileRepository;
import java.util.List;

public class VendaService {
    public static void registrarVenda(Venda venda) {
        FileRepository.salvarVenda(venda);
        System.out.println("✅ Venda registrada com sucesso!");
    }

    public static void listarVendas() {
        List<Venda> vendas = FileRepository.lerVendas();
        for (Venda v : vendas) {
            System.out.println("Venda: " + v.getProduto().getNome() + " - Cliente: " + v.getCliente().getNome());
        }
    }
}
