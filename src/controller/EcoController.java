package controller;

import model.Carrinho;
import model.EcoProduto;
import model.ImpProduto;
import repository.ProdutoRepository;



public class EcoController {
    private ProdutoRepository produtoRepository = new ImpProduto();
    private Carrinho carrinho = new Carrinho();

    public void adicionarProduto(int id, String nome, double preco) {
        EcoProduto ecoProduto = new EcoProduto(id, nome, preco) {
            @Override
            public String getDescricao() {
                return "EcoProduto Genérico: " + getNome() + ", Preço: R$" + getPreco();
            }
        };
        produtoRepository.adicionarProduto(ecoProduto);
    }

    public void atualizarProduto(int id, String nome, double preco) {
        EcoProduto ecoProduto = new EcoProduto(id, nome, preco) {
            @Override
            public String getDescricao() {
                return "EcoProduto Genérico: " + getNome() + ", Preço: R$" + getPreco();
            }
        };
        produtoRepository.atualizarProduto(ecoProduto);
    }

    public void deletarProduto(int id) {
        produtoRepository.deletarProduto(id);
    }

    public void listarProdutos() {
        produtoRepository.listarProdutos().forEach(System.out::println);
    }

    public void adicionarAoCarrinho(int id) {
        produtoRepository.obterProduto(id).ifPresent(carrinho::adicionarProduto);
    }

    public void removerDoCarrinho(int id) {
        carrinho.removerProduto(id);
    }

    public void listarCarrinho() {
        carrinho.listarItens();
    }

    public double calcularTotalCarrinho() {
        return carrinho.calcularTotal();
    }

    public void finalizarCompra() {
        System.out.println("Produtos comprados: ");
        listarCarrinho();
        System.out.println("Total a pagar: R$ " + calcularTotalCarrinho());
        carrinho.limparCarrinho();
    }
}

