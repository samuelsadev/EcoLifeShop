package model;

public class ProdutoEspecial extends EcoProduto {
    private String descricaoEspecial;

    public String getDescricaoEspecial() {
        return descricaoEspecial;
    }

    public void setDescricaoEspecial(String descricaoEspecial) {
        this.descricaoEspecial = descricaoEspecial;
    }

    public ProdutoEspecial(int id, String nomeProduto, double preco, String descricaoEspecial) {
        super(id, nomeProduto, preco);
        this.descricaoEspecial = descricaoEspecial;
    }

    @Override
    public String toString() {
        return "Produto Especial {ID = " + getId() + ", Nome = " + getNomeProduto() + "', Preço = " + getPreco() + ", Descrição = " + descricaoEspecial + "'}";
    }
}
