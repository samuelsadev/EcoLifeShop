import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op;

        while (true){
            System.out.println("            Bem vinde ao EcoLifeShop!                ");
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
                    System.out.println("Adicionar produto\n\n");

                    break;
                case 2:
                    System.out.println("Atualizar Produto\n\n");

                    break;
                case 3:
                    System.out.println("Deletar Produto\n\n");

                    break;
                case 4:
                    System.out.println("Listar Produtos\n\n");

                    break;
                case 5:
                    System.out.println("Adicionar ao Carrinho\n\n");

                    break;
                case 6:
                    System.out.println("Remover do Carrinho\n\n");

                    break;
                case 7:
                    System.out.println("Listar Carrinho\n\n");

                    break;
                case 8:
                    System.out.println("Calcular Total do Carrinho\n\n");

                    break;
                case 9:
                    System.out.println("Finalizar compra\n\n");

                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}
