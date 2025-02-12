package repository;
import models.Produto;
import models.Cliente;
import models.Venda;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRepository {
    private static final String PRODUTO_FILE = "data/produtos.txt";
    private static final String CLIENTE_FILE = "data/clientes.txt";
    private static final String VENDA_FILE = "data/vendas.txt";

    public static void salvarVenda(Venda venda) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VENDA_FILE, true))) {
            oos.writeObject(venda);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Venda> lerVendas() {
        List<Venda> vendas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(VENDA_FILE))) {
            while (true) {
                vendas.add((Venda) ois.readObject());
            }
        } catch (EOFException e) {
            return vendas;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return vendas;
    }
}
