public abstract class Pix extends Cliente{
    protected double transferenciaPix;
    protected double limite;

    public Pix (int numConta, double limite, double saldo, double pontuacao, String nome, int cpf, String email, int senha, double limite1) {
        super ( numConta, limite, saldo, pontuacao, nome, cpf, email, senha );
        this.limite = limite1;
    }

    public Pix (double limite) {
    }
}
