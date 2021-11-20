public class Funcionario extends Filial{
    private String nome;
    private double salario;
    private int numeroFuncionario;


    public Funcionario (int numeroFilial, String nome, double salario, int numeroFuncionario) {
        super ( numeroFilial );
        this.nome = nome;
        this.salario = salario;
        this.numeroFuncionario = numeroFuncionario;
    }
}
