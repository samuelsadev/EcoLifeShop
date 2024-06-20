package model;

public abstract class EcoProduto {
    private int id;
    private String nome;
    private double preco;

    public EcoProduto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "EcoProduto{ ID = " + id + ", Nome = " + nome + "', Preço = " + preco + "}";
    }

    public String getDescricao() {
        return "EcoProduto Genérico: " + nome + ", Preço: R$" + preco;
    }
}
