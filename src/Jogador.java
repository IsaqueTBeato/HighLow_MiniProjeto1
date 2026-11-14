import java.util.ArrayList;

public class Jogador {

    private String nome;
    private int pontuacaoAcumulada;
    private int numeroRondas;
    private ArrayList<Integer> historicoPontuacoes;
    boolean jEspecial;

    public Jogador(String nome, boolean jEspecial) {
        this.nome = nome;
        this.pontuacaoAcumulada = 0;
        this.numeroRondas = 0;
        this.historicoPontuacoes = new ArrayList<>();
        this.jEspecial = jEspecial;
    } 
}