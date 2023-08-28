package br.com.alura.screenmatch.calculos;

public class FiltroRecomencao {
    public void filtrar(Classificavel classificavel){

        if(classificavel.getclassificacao() >= 4) {
            System.out.println("Esta entre os preferidos do momento!");
        } else if (classificavel.getclassificacao() >= 2) {
            System.out.println("Muito bem avaliado!");
        }
else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }

}
