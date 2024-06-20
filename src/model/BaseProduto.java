package model;

import repository.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseProduto implements ProdutoRepository {
    protected List<EcoProduto> produtos = new ArrayList<>();

    @Override
    public List<EcoProduto> listarProdutos() {
        return produtos;
    }
}
