public class Transferencia extends Cliente {
//Esse metodo de transferencias tem um custo em cima


    public Transferencia (int numConta, double limite, double saldo, double pontuacao, String nome, int cpf, String email, int senha) {
        super ( numConta, limite, saldo, pontuacao, nome, cpf, email, senha );
    }

    public Transferencia ( ) {
        double qtdtrans = entrada.nextDouble () + 10;

        if (limite > qtdtrans){
            if (saldo > qtdtrans) {
                System.out.println ("valer final a ser transferido:" + qtdtrans);
                System.out.println ("Concorda com essa transação");
                String resposta = entrada.next ();
                if (resposta == "sim" || resposta == "Sim") {
                    System.out.println ( "Transferencia concluida com sucesso" );
                    System.out.println ( "Total após transferencia: " + (saldo - qtdtrans) );
                    saldo =- qtdtrans;
                }else if(resposta == "não" || resposta == "Não"){
                    System.out.println ("transação cancelada");
                }
                //COLOCAR TRATAMENTO PARA NUMERO*
            }
        }else if(limite < qtdtrans) {
            System.out.println ("Essa transferencia está passando do limite definido");
        }
    }
}
