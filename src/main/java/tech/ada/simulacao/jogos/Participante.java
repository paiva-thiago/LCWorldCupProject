package tech.ada.simulacao.jogos;

import tech.ada.simulacao.equipes.Selecao;

public class Participante {
    private Selecao equipe;
    private Integer qtGols;

    public Selecao getEquipe() {
        return equipe;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "equipe=" + equipe +
                ", qtGols=" + qtGols +
                '}';
    }

    public void setEquipe(Selecao equipe) {
        this.equipe = equipe;
    }

    public Integer getQtGols() {
        return qtGols;
    }

    public void setQtGols(Integer qtGols) {
        this.qtGols = qtGols;
    }

    public Participante(String nmEquipe, Integer gols){
        equipe = new Selecao(nmEquipe);
        qtGols = gols;
    }
}
