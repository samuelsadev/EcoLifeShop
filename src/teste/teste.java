package teste;

import controller.EcoController;

public class teste {
    public static void main(String[] args) {

            EcoController controller = new EcoController();

            // Adicionando alguns produtos para teste
            controller.adicionarProduto(1, "Copo Eco", 5.99);
            controller.adicionarProduto(2, "EcoBag", 22.90);
            controller.adicionarProduto(3, "Camisa Ecologica", 59.95);

            // Listando os produtos adicionados
            System.out.println("Lista de Produtos:");
            controller.listarProdutos();
            System.out.println();

            // Adicionando produtos ao carrinho
            controller.adicionarAoCarrinho(1);
            controller.adicionarAoCarrinho(2);

            // Listando o carrinho
            System.out.println("Itens no carrinho:");
            controller.listarCarrinho();
            System.out.println("Total do carrinho: R$ " + controller.calcularTotalCarrinho());
            System.out.println();

            // Removendo um produto do carrinho
            controller.removerDoCarrinho(1);

            // Listando o carrinho após remoção
            System.out.println("Itens no Carrinho após remover um produto:");
            controller.listarCarrinho();
            System.out.println("Total do Carrinho: R$ " + controller.calcularTotalCarrinho());
            System.out.println();

            // Finalizando a compra
            System.out.println("Finalizando a compra:");
            controller.finalizarCompra();
            System.out.println();
    }
}
