package tech.ada.simulacao.jogos;

public class Jogo {
    private Participante primeiraEquipe;
    private Participante segundaEquipe;

    public Jogo(String nmPrimeiraEquipe, Integer golsPrimeiraEquipe, String nmSegundaEquipe, Integer golsSegundaEquipe){
        primeiraEquipe = new Participante(nmPrimeiraEquipe,golsPrimeiraEquipe);
        segundaEquipe = new Participante(nmSegundaEquipe,golsSegundaEquipe);
    }

    public Participante getPrimeiraEquipe() {
        return primeiraEquipe;
    }

    public Participante getSegundaEquipe() {
        return segundaEquipe;
    }

    public void setSegundaEquipe(Participante segundaEquipe) {
        this.segundaEquipe = segundaEquipe;
    }

    public void setPrimeiraEquipe(Participante primeiraEquipe) {
        this.primeiraEquipe = primeiraEquipe;
    }

    public String resultadoDoJogo(){
        String nomePrimeira = this.primeiraEquipe.getEquipe().getNmPais();
        String nomeSegunda  = this.segundaEquipe.getEquipe().getNmPais();
        Integer golsPrimeira = this.primeiraEquipe.getQtGols();
        Integer golsSegunda = this.segundaEquipe.getQtGols();
        return nomePrimeira.concat(" ")
                .concat(golsPrimeira.toString())
                .concat(" X ")
                .concat(golsSegunda.toString())
                .concat(" ")
                .concat(nomeSegunda);
    }

    public Boolean empate(){
        return Boolean.FALSE;
    }

    public String getVencedorComentado(){
        if(empate()){
            return "Houve um empate entre "+primeiraEquipe.getEquipe().getNmPais()+" e "+segundaEquipe.getEquipe().getNmPais();
        }else {
            return primeiraEquipe.getEquipe().getNmPais()+" venceu a partida!";
        }
    }

    public Participante getParticipanteVencedor(){
        return segundaEquipe;
    }
}
