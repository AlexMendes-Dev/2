package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomencao;
import br.com.alura.screenmatch.modelos.Filme;
public class Principal {
    private static Filme Serie;
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Jonh Wick 4");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //System.out.println("Nota do Filme: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Duração do Filme:" + meuFilme.getDuracaoEmMinutos());
        System.out.println("Quantidade de Avalições: " + meuFilme.getTotalDeAvaliacao());
        System.out.printf("Media das Avaliações: %.1f\n ", meuFilme.pegaMedia());


        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacao = 1;
        // System.out.println( meuFilme.pegaMedia());

        System.out.println(" ");
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para Maratonar Lost:" +lost.getDuracaoEmMinutos() + " Minutos");

        Filme outroFilme = new Filme();
        outroFilme .setNome("Jonh Wick 3");
        outroFilme .setAnoDeLancamento(2021);
        outroFilme .setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomencao filtro = new FiltroRecomencao();
        filtro.filtrar(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(200);
        filtro.filtrar(episodio);


    }
}