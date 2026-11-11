// Autor: Isaque Santos - a22608528

import java.util.ArrayList;
import java.util.Collections;

// Baralho - classe que representa o conjunto de 52 cartas que é utilizado para jogar o jogo
public class Baralho {
    // Atributo, sendo um ArrayList do tipo Carta, que vai guardar todas as 52 cartas do jogo
    private ArrayList<Carta> cartas;

    // Construtor que inicializa o atributo cartas da classe
    public Baralho() {
        this.cartas = new ArrayList<>();
        this.criarBaralho();
    }

    /**
     * Procedimento privado que é responsável por criar as 52 cartas do jogo e popular o ArrayList
     */
    private void criarBaralho() {
        // Variáveis auxiliares para controlar a quantidade de naipes e o valor da carta
        int nNaipe = 1;
        int vCarta = 2;

        // Loop que vai criar as 52 cartas do baralho, sendo 13 de cada naipe
        while (nNaipe < 5) {
            if (vCarta < 15) {
                if (nNaipe == 1) {
                    Carta espadas = new Carta( vCarta, "Espadas");
                    this.cartas.add(espadas);
                    vCarta++;
                } else if (nNaipe == 2) {
                    Carta copas = new Carta(vCarta, "Copas");
                    this.cartas.add(copas);
                    vCarta++;
                } else if (nNaipe == 3) {
                    Carta paus = new Carta(vCarta, "Paus");
                    this.cartas.add(paus);
                    vCarta++;
                } else if (nNaipe == 4) {
                    Carta ouros = new Carta(vCarta, "Ouros");
                    this.cartas.add(ouros);
                    vCarta++;
                }
            } else{
                vCarta = 2;
                nNaipe++;
            }
        }
    }

    /**
     * Procedimento que vai alterar as posições dos valores dentro do ArrayList
     */
    public void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    /**
     * Método para tirar uma carta do topo do baralho para apresentar para o jogador
     * @return a carta que está no topo do baralho (primeira posição do ArrayList)
     */
    public Carta tirarCarta() {
        return this.cartas.removeFirst();
    }

    /**
     * Método que mostra a quantidade de cartas que ainda existem no baralho
     * @return o tamanho do ArrayList
     */
    public int cartasRestantes() {
        return cartas.size();
    }
}
