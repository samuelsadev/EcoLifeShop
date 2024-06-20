package repository;

import model.EcoProduto;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {
        void adicionarProduto(EcoProduto produto);
        Optional<EcoProduto> obterProduto(int id);
        void atualizarProduto(EcoProduto produto);
        void deletarProduto(int id);
        List<EcoProduto> listarProdutos();
}
