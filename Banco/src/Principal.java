import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        //criar array list de cliente e funcionario
        Cliente Roberio = new Cliente (111,222,333,1111,"oi",11112,"eygon11@yaHO.COM",123456){};

        //COLOCAR SISTEMA DE ESTRATO
        System.out.println ( "escolha um numero de 1 a 4, 0 para acabar a operação " );
        Scanner entrada2 = new Scanner ( System.in );
        int numEscolhido = entrada2.nextInt ();
        if (numEscolhido == 1) {
            Cliente pix = new ChavePix ( 14000.0 );
        } else if (numEscolhido == 2) {
            Cliente deposito= new Doacao ();
        } else if (numEscolhido == 3) {

        } else if (numEscolhido == 4) {
            Cliente transferencia = new Transferencia ();
        }
    }
}
