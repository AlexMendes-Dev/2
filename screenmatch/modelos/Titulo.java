package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private   boolean incluidoNoPlano;
    private  double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;
    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean IncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;

    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        System.out.println("Filme incluído no seu Plano!");
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacao;
        //esse return, vai retornar o valor dessa operação.

    }
}
