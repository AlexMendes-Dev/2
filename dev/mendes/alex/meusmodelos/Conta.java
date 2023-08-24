package dev.mendes.alex.meusmodelos;
import java.util.Scanner;

public class Conta {
    Scanner leia = new Scanner(System.in);
    private String nome = "Alexsandro Mendes Brandão";
    private int numeroDaAgencia = 1020;
    private int numeroDaConta = 01020304;
    private String tipoDeConta = "Corrente";
    private double saldoInicial;
    private double deposito;
    private double saque;
    private int operacao;
    int opcao;
    int codigo;
    int agencia;
    int conta;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public double getNumeroDaAgencia(){
        return numeroDaAgencia;
    }
   public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {

        this.saque = saque;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }
    public void dadosIniciaisDaConta(){
    System.out.println("SEJA BEM VINDO!!!!\nAO SEU BANCO.\n");

        System.out.println("""
                DIGITE A OPÇÃO DESEJADA PARA INICIA SEU ATENDIMENTO:
                1- CODIGO DE ACESSO.
                2- AGÊNCIA E CONTA.
                """);
            opcao = leia.nextInt();
        while (opcao == 0) {
            if (opcao == 1 && codigo == 0102) {
                System.out.println("Digite seu codigo de acesso com 4 digitos:");
                 codigo = leia.nextInt();
                 break;

            } else if(codigo != 0102){
                System.out.println("Codigo inválido.");
                //System.out.println("Digite seu codigo de acesso com 4 digitos:");
                codigo = leia.nextInt();
                break;
            }
            else {
                System.out.println("Digite sua Agencia:");
                agencia = leia.nextInt();
                System.out.println("Digite sua Conta:");
                conta = leia.nextInt();
                break;
            }
        }
        System.out.println("Dados inicias do cliente:");
        System.out.println("***************************************");
        System.out.println("");
        System.out.println("Nome:               "+ nome);
        System.out.println("Tipo de Conta:      "+tipoDeConta);
        //System.out.printf("Saldo Inicial:      %.2f:\n",saldoInicial);
        System.out.println("Número da Agencia:  " + numeroDaAgencia);
        System.out.println("Número da Conta:    " + numeroDaConta);
        System.out.println("***************************************");

    }
    public int operacaoo (){
        while(operacao != 4) {
            System.out.println("""
                    Operações:
                                    
                    1- Consultar Saldos:
                    2- Receber valor
                    3- Tranferir valor
                    4- sair""");
            System.out.println("Digite a opção desejada:");
            operacao = leia.nextInt();

            switch (operacao) {
                case 1:
                    System.out.printf("Saldo: %.2f\n ", saldoInicial);
                    //System.out.println(saldoInicial);
                    break;
                case 2:
                    System.out.println("Receber valor");
                    System.out.println("Informe o valor de deposito:");
                    deposito = leia.nextDouble();
                    saldoInicial += deposito;
                    System.out.printf("Saldo Atualizado %.2f R$\n", saldoInicial);
                    break;

                case 3:
                    System.out.println("Tranferir valor");
                    System.out.println("Informe o valor de saque:");
                    saque = leia.nextDouble();
                    if (saque > saldoInicial){
                        //saldoIncial -= 0 ;
                        System.out.println("Não há saldo suficiente. Tente outro valor!");
                    } else {
                        saldoInicial -= saque;
                        System.out.printf("Saldo Atualizado %.2f R$\n", saldoInicial);
                    }
                    break;

                case 4:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Operação Inválida.");
                    break;
            }
        }

        return operacao;
    }

}
