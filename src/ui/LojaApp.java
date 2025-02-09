package ui;
import models.*;
import services.VendaService;
import java.util.Scanner;

public class LojaApp {
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🏪 Bem-vindo à Loja de Roupas!");
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();
        
        Cliente cliente = new Cliente(nome, email);

        Produto camisa = new Produto("Camisa", 49.99, 10, 2);
        Venda venda = new Venda(cliente, camisa, 1);
        VendaService.registrarVenda(venda);

        scanner.close();
    }
}
