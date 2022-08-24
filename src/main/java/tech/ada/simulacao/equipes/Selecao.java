package tech.ada.simulacao.equipes;

public class Selecao {
    private String nmPais;

    public Selecao(String nmPais){
        this.nmPais = nmPais;
    }

    @Override
    public String toString() {
        return "Selecao{" +
                "nmPais='" + nmPais + '\'' +
                '}';
    }

    public String getNmPais() {
        return nmPais;
    }

    public void setNmPais(String nmPais) {
        this.nmPais = nmPais;
    }
}
