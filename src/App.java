import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        int MAX_ELEMENTOS = 2;
        int opcao, qtdCadastrados = 0;
        Historico historico = new Historico();
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar novo calculo");
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

                System.out.println("Informe o número 1:");
                double num1 = in.nextDouble();

                System.out.println("Informe o número 2:");
                double num2 = in.nextDouble();

                Calculo cal = new Calculo();
                cal.setNum1(num1);
                cal.setNum2(num2);

                if (opcao == 1) {
                    cal.somar();
                } else if (opcao == 2) {
                    cal.subtrair();
                } else if (opcao == 3) {
                    cal.multiplicar();
                } else if (opcao == 4) {
                    cal.dividir();
                }

                System.out.println("Resultado: " + cal.getResultado());
                historico.adicionar(cal);

                in.nextLine();
                voltarMenu(in);

            } else if (opcao == 2) {
                historico.listar();

                voltarMenu(in);
            } else if (opcao == 3) {
                historico.expandir(in);
                in.nextLine();
                voltarMenu(in);
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
