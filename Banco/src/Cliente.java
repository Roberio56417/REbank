public abstract class Cliente extends Banco {
    protected int numConta;
    protected double limite;
    protected double saldo;
    protected double pontuacao;
    protected String nome;
    protected int cpf;
    protected String email;
    protected int senha;


    public Cliente (int numConta, double limite, double saldo, double pontuacao, String nome, int cpf, String email, int senha) {
        this.numConta = numConta;
        this.limite = limite;
        this.saldo = saldo;
        this.pontuacao = pontuacao;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public Cliente ( ) {

    }
}
