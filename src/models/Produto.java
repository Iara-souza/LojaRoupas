package models;
import java.io.Serializable;

public class Produto implements Serializable {
    private String nome;
    private double preco;
    private int estoque;
    private int estoqueMinimo;

    public Produto(String nome, double preco, int estoque, int estoqueMinimo) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
    public int getEstoqueMinimo() { return estoqueMinimo; }

    public void reduzirEstoque(int quantidade) {
        this.estoque -= quantidade;
    }

    public boolean precisaRepor() {
        return estoque < estoqueMinimo;
    }
}