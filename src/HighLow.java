// Autor: Nair Assis a22608157

import java.io.Console;
import java.util.Scanner;

/**
 * A classe responsável pela execução do jogo HighLow.
 * Permite ao Jogador adivinhar se a próxima carta
 * terá um valor superior ou inferior à carta atual.
 */

public class HighLow {
    // Baralho utilizado durante o jogo
    private Baralho baralho;

    // Pontuação obtida em cada ronda
    private int pontuacao;

    // Número total de rondas realizadas
    private int totalRondas;

    // Soma das pontuações de todas as rondas
    private int totalPontos;

    // Scanner utilizado para receber as escolhas do jogador
    private Scanner input;

    /**
     * Construtor da classe HighLow.
     * Inicializa o baralho e os contadores do jogo.
     */
    public HighLow(Scanner input) {

        this.baralho = new Baralho();
        this.pontuacao = 0;
        this.totalRondas = 0;
        this.totalPontos = 0;
        this.input = input;
    }

    /**
     * Método responsável por controlar o jogo.
     * Que permite realizar várias rondas e apresentar os resultados finais.
     */
    public void jogar() {

        boolean continuar = true;
        this.baralho.embaralhar();

        while (continuar && this.baralho.cartasRestantes() >= 2) {

            // Executar uma ronda
            this.jogarRonda();

            // Verificar se ainda existem cartas suficientes
            if (this.baralho.cartasRestantes() < 2) {
                System.out.println("\nO baralho terminou!");
                break;
            }

            // Perguntar se o jogador deseja continuar
            System.out.println("\nDesejas jogar novamente? (S/N)");

            String resposta = this.input.nextLine().trim().toUpperCase();

            while (!resposta.equals("S") && !resposta.equals("N")) {

                System.out.println("Resposta inválida. Introduz S ou N.");
                resposta = this.input.nextLine().trim().toUpperCase();
            }

            continuar = resposta.equals("S");
        }

        // Apresentar os resultados finais
        this.mostrarResultadosFinais();
    }

    /**
     * Método responsável por executar uma ronda do jogo HighLow.
     */
    public void jogarRonda() {
        System.out.println("\n===== RONDA Nº " + (this.totalRondas + 1) + " =====");

        // Reiniciar a pontuação da ronda
        this.pontuacao = 0;

        // Verificar se existem cartas suficientes
        if (this.baralho.cartasRestantes() < 2) {
            System.out.println("Não existem cartas suficientes para iniciar outra ronda.");
            return;
        }

        // Retirar a primeira carta
        Carta cartaAtual = this.baralho.tirarCarta();

        // Enquanto existirem cartas para comparar
        while (this.baralho.cartasRestantes() > 0) {

            System.out.println("\nA tua carta é: " + cartaAtual);

            // Pedir ao jogador para escolher
            char escolha;

            do {
                System.out.println("\nA próxima carta será maior ou menor?");
                System.out.println("H - Maior");
                System.out.println("L - Menor");

                escolha = this.input.nextLine().trim().toUpperCase().charAt(0);

                if (escolha != 'H' && escolha != 'L') {
                    System.out.println("Escolha inválida. Introduz H ou L.");
                }

            } while (escolha != 'H' && escolha != 'L');

            // Retirar a próxima carta
            Carta proximaCarta = this.baralho.tirarCarta();

            System.out.println("A próxima carta é: " + proximaCarta);

            // Verificar se o jogador acertou
            if ((escolha == 'H' && proximaCarta.getValor() > cartaAtual.getValor()) ||
                    (escolha == 'L' && proximaCarta.getValor() < cartaAtual.getValor())) {

                this.pontuacao++;

                System.out.println("Acertaste! Ganhaste 1 ponto.");

                // A próxima carta passa a ser a carta atual
                cartaAtual = proximaCarta;

            } else {

                System.out.println("Erraste! A ronda terminou.");

                break;
            }
        }

        // Atualizar os resultados gerais
        this.totalRondas++;
        this.totalPontos += this.pontuacao;

        System.out.println("\nPontuação desta ronda: " + this.pontuacao);
    }

    /**
     * Método responsável por apresentar os resultados finais do jogo.
     */
    private void mostrarResultadosFinais() {
        System.out.println("\n===== RESULTADOS FINAIS =====");
        System.out.println("Total de rondas: " + this.totalRondas);
        System.out.println("Pontuação total: " + this.totalPontos);

        if (this.totalRondas > 0) {

            double media = (double) this.totalPontos / this.totalRondas;

            System.out.printf("Pontuação média: %.2f%n", media);

        } else {

            System.out.println("Não foram realizadas rondas.");
        }
    }
}
