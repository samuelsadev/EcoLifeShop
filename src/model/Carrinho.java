package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<EcoProduto> itens = new ArrayList<>();

    public void adicionarProduto(EcoProduto produto) {
        itens.add(produto);
    }

    public void removerProduto(int id) {
        itens.removeIf(produto -> produto
                .getId() == id);
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(EcoProduto::getPreco)
                .sum();
    }

    public void listarItens() {
        itens.forEach(System.out::println);
    }

    public void limparCarrinho() {
        itens.clear();
    }
}
