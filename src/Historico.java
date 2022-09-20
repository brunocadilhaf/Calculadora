import java.util.Scanner;

public class Historico {
    private int MAX_ELEMENTOS = 2;
    private int qtdCadastrados = 0;
    private Calculo[] calculos = new Calculo[MAX_ELEMENTOS];

    public void adicionar(Calculo cal) {
        if (qtdCadastrados == MAX_ELEMENTOS) {
            System.out.println("Não há mais espaço para armazenamento de cálculo!");
        } else {
            calculos[qtdCadastrados] = cal;
            qtdCadastrados++;
        }
    }

    public void listar() {
        if (qtdCadastrados == 0) {
            System.out.println("\nNão há calculos cadastrados para exibir.");
        } else {
            for (int i = 0; i < qtdCadastrados; i++) {
                Calculo cal = calculos[i];
                System.out.println("\nCalculo " + i);
                System.out.println("Número 1: " + cal.getNum1());
                System.out.println("Número 2: " + cal.getNum2());
                System.out.println("Tipo de calculo: " + cal.getTipo());
                System.out.println("Resultado: " + cal.getResultado());
                System.out.println("---------");
            }
        }
    }

    public void expandir(Scanner in) {
        System.out.println("Informe a nova quantidade de itens no histórico:");
        int quantidade = in.nextInt();

        if (quantidade < MAX_ELEMENTOS) {
            System.out.println("A quantidade informada não pode ser menor que a quantidade atual!");
        } else if (quantidade == MAX_ELEMENTOS) {
            System.out.println("A quantidade informada não pode ser igual a quantidade atual!");
        } else {
            Calculo[] novaLista = new Calculo[quantidade];
            for (int i = 0; i < MAX_ELEMENTOS; i++) {
                novaLista[i] = calculos[i];
            }

            calculos = novaLista;
            MAX_ELEMENTOS = quantidade;
        }
    }
}
