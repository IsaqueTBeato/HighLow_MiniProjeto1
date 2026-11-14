// Autor:Diogo Correia a22608200
// Autor: Isaque Santos - a22608528

import java.util.Scanner;

// Classe principal responsável pelo menu e execução do programa
public class Main {

    public static void main(String[] args) {

        // Criar o Scanner para receber as opções do utilizador
        Scanner input = new Scanner(System.in);

        boolean sair = false;

        // Ciclo principal do menu
        while (!sair) {

            mostrarMenu();

            System.out.print("\nEscolhe uma opção: ");

            String opcao = input.nextLine().trim();

            switch (opcao) {

                case "1":

                    System.out.println("\n===== NOVO JOGO =====");

                    // Criar uma nova partida
                    HighLow jogo = new HighLow(input);

                    // Iniciar o jogo
                    jogo.jogar();

                    // Aguardar antes de regressar ao menu
                    pausar(input);

                    break;

                case "2":

                    mostrarRegras();

                    pausar(input);

                    break;

                case "0":

                    sair = true;

                    System.out.println("\nObrigado por jogar HighLow!");

                    break;

                default:

                    System.out.println("\nOpção inválida! Tenta novamente.");

                    break;
            }
        }

        // Fechar o Scanner ao terminar a aplicação
        input.close();
    }

    /**
     * Método responsável por apresentar o menu principal.
     */
    private static void mostrarMenu() {

        System.out.println("\n================================");
        System.out.println("            HIGHLOW");
        System.out.println("          CARD GAME");
        System.out.println("================================");

        System.out.println("1 - Novo jogo");
        System.out.println("2 - Regras");
        System.out.println("0 - Sair");

        System.out.println("================================");
    }

    /**
     * Método responsável por apresentar as regras do jogo.
     */
    private static void mostrarRegras() {

        System.out.println("\n========== REGRAS ==========");

        System.out.println("1. O jogo utiliza um baralho de 52 cartas.");
        System.out.println("2. Uma carta é apresentada ao jogador.");
        System.out.println("3. O jogador deve prever se a próxima carta");
        System.out.println("   terá um valor maior ou menor.");
        System.out.println("4. Cada previsão correta vale 1 ponto.");
        System.out.println("5. Uma previsão errada ou uma carta de");
        System.out.println("   igual valor termina a ronda.");
        System.out.println("6. Após cada ronda, o jogador pode");
        System.out.println("   decidir se pretende continuar.");
        System.out.println("7. No final, é apresentada a pontuação");
        System.out.println("   média das rondas realizadas.");

        System.out.println("============================");
    }

    /**
     * Método que aguarda a confirmação do utilizador.
     */
    private static void pausar(Scanner input) {

        System.out.println("\nPrima ENTER para voltar ao menu...");
        input.nextLine();
    }
}
