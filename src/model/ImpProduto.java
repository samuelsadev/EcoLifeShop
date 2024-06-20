package model;

import java.util.Optional;

public class ImpProduto extends BaseProduto {

    @Override
    public void adicionarProduto(EcoProduto produto) {
        produtos.add(produto);
    }

    @Override
    public Optional<EcoProduto> obterProduto(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public void atualizarProduto(EcoProduto produto) {
        obterProduto(produto.getId()).ifPresent(p -> {
            p.setNome(produto.getNome());
            p.setPreco(produto.getPreco());
        });
    }

    @Override
    public void deletarProduto(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }
}
