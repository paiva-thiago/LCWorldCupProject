package tech.ada.simulacao;

import tech.ada.simulacao.jogos.Jogo;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Jogo> jogos;
    public static void main(String[] args) {
        jogos  = new ArrayList();
        jogos.add(new Jogo("BRASIL", 0, "SUICA", 0));
        jogos.add(new Jogo("SERVIA", 0, "CAMAROES",0));
        for(Jogo j:jogos){
            System.out.println("============================");
            System.out.println(j.resultadoDoJogo());
            System.out.println(j.getVencedorComentado());
            System.out.println(j.getParticipanteVencedor());
        }
    }
}
