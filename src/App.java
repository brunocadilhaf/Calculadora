import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        int MAX_ELEMENTOS = 2;
        int opcao, qtdCadastrados = 0;
        // Pessoa[] pilotos = new Pessoa[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Novo calculo");
            System.out.println("2 - Listar histórico");
            System.out.println("3 - Aumentar espaço de armazenamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                System.out.println("\n****\nMENU\n****\n");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.print("Opção: ");
    
                opcao = in.nextInt();
                in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior


                // Novo calculo

                in.nextLine();
                voltarMenu(in);

            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há calculos cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                }

                voltarMenu(in);
            } else if (opcao == 3) {

            } else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");
        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}
