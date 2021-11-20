public abstract class Filial extends Banco {
    protected String local;
    protected double horaAbre;
    protected double horaFecha;
    protected int numeroFilial;

    public Filial (int numeroFilial) {
        this.numeroFilial = numeroFilial;
    }
}
