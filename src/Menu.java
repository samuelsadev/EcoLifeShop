import controller.EcoController;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        EcoController controller = new EcoController();
        Scanner scanner = new Scanner(System.in);

        int op;

        while (true){
            System.out.println("\n            Bem vinde ao EcoLifeShop!                ");
            System.out.println("                                                     ");
            System.out.println("                      Menu                           ");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar produto                    ");
            System.out.println("            2 - Atualizar Produto                    ");
            System.out.println("            3 - Deletar Produto                      ");
            System.out.println("            4 - Listar Produtos                      ");
            System.out.println("            5 - Adicionar ao Carrinho                ");
            System.out.println("            6 - Remover do Carrinho                  ");
            System.out.println("            7 - Listar Carrinho                      ");
            System.out.println("            8 - Calcular Total do Carrinho           ");
            System.out.println("            9 - Finalizar compra                     ");
            System.out.println("            10 - Sair                                ");
            System.out.println("                                                     ");
            System.out.println("Entre com a opção desejada:                          ");

            op = scanner.nextInt();

            if (op == 10) {
                System.out.println("\nObrigade por cooperar com nosso planeta!");
                scanner.close();
                System.exit(0);
            }

            switch (op) {
                case 1:
                    System.out.println("\nAdicionar produto\n\n");
                    System.out.print("\nID do Produto: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\nNome do Produto: ");
                    String nome1 = scanner.nextLine();
                    System.out.print("\nPreço do Produto: ");
                    double preco1 = scanner.nextDouble();
                    controller.adicionarProduto(id1, nome1, preco1);
                    System.out.println("\nProduto adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("\nAtualizar Produto\n\n");
                    System.out.print("\nID do Produto: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\nNovo Nome do Produto: ");
                    String nome2 = scanner.nextLine();
                    System.out.print("\nNovo Preço do Produto: ");
                    double preco2 = scanner.nextDouble();
                    controller.atualizarProduto(id2, nome2, preco2);
                    System.out.println("Produto atualizado com sucesso.");
                    break;
                case 3:
                    System.out.println("Deletar Produto\n\n");
                    System.out.print("ID do Produto: ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine();
                    controller.deletarProduto(id3);
                    System.out.println("Produto deletado com sucesso.");
                    break;
                case 4:
                    System.out.println("Listar Produtos\n\n");
                    System.out.println("Lista de Produtos:");
                    controller.listarProdutos();
                    break;
                case 5:
                    System.out.println("Adicionar ao Carrinho\n\n");
                    System.out.print("ID do Produto: ");
                    int id5 = scanner.nextInt();
                    scanner.nextLine();
                    controller.adicionarAoCarrinho(id5);
                    System.out.println("Produto adicionado ao carrinho.");
                    break;
                case 6:
                    System.out.println("Remover do Carrinho\n\n");
                    System.out.print("ID do Produto: ");
                    int id6 = scanner.nextInt();
                    scanner.nextLine();
                    controller.removerDoCarrinho(id6);
                    System.out.println("Produto removido do carrinho.");
                    break;
                case 7:
                    System.out.println("Listar Carrinho\n\n");
                    System.out.println("Itens no Carrinho:");
                    controller.listarCarrinho();
                    break;
                case 8:
                    System.out.println("Calcular Total do Carrinho\n\n");
                    double total = controller.calcularTotalCarrinho();
                    System.out.println("Total do Carrinho: R$ " + total);
                    break;
                case 9:
                    System.out.println("Finalizar compra\n\n");
                    System.out.println("Finalizando a compra:");
                    controller.finalizarCompra();
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}
