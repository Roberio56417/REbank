public class ChavePix extends Pix{
    private String nome;
    private String email;
    private int  cpfChave;
    private double numeroDeTelefone;
    private long chavePix;


    public ChavePix (double limite) {
        super ( limite );
    }




    public void TransferenciaPix(){
        System.out.println ("qual o valor da transferencia ?");
        double tranferencia = entrada.nextDouble ();
        if (cpf == cpfChave ){
            if (limite > tranferencia){
                System.out.println ("Transferencia concluida com sucesso");
                System.out.println ("Total após transferencia: " + (saldo - tranferencia) );

            }else if(limite < tranferencia) {
                System.out.println ("Essa transferencia está passando do limite definido");
            }
        }

    }
}
