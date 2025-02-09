package models;
import java.io.Serializable;
import java.util.Date;

public class Venda implements Serializable {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private Date data;

    public Venda(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = new Date();
    }

    public Cliente getCliente() { return cliente; }
    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public Date getData() { return data; }
}
