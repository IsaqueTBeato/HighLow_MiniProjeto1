// Autor: Isaque Santos - a22608528

// Carta: classe que representa as cartas presentes no jogo
public class Carta {
    // Atributo que indica o valor da carta de forma numérica
    // Ex: 2, 3, 4, 5, 6, 7, 8, 9, 10, J = 11, Q = 12, K = 13, A = 14
    private int valor;

    // Atributo que representa um dos quatro naipes (copas, espadas, paus e ouros)
    private String naipe;

    /**
     * Construtor da classe Carta para inicializar os parâmetros
     * @param valor - inicializador do atributo valor
     * @param naipe - inicializador do atributo naipe
     */
    public Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    /**
     * Método get para obter o valor da carta
     */
    public int getValor() {
        return this.valor;
    }

    /**
     * Método get para obter o naipe da carta
     */
    public String getNaipe() {
        return this.naipe;
    }

    /**
     * Método que retorna um texto com as informações da carta
     * @return o texto com o valor e naipe da carta
     */
    @Override 
    public String toString() {
        if (this.valor == 14) {
            return "Ás de " + this.naipe;
        } else if (this.valor == 11) {
            return "Valete de " + this.naipe;
        } else if (this.valor == 12) {
            return "Dama de " + this.naipe;
        } else if (this.valor == 13) {
            return "Rei de " + this.naipe;
        } else return this.valor + " de " + this.naipe;
    }
}
