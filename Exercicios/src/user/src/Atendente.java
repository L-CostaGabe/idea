import java.util.Scanner;

public class Atendente extends Usuario {
    private double valorCaixa;
    private Scanner scanner = new Scanner(System.in);


    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void receberPagamento() {
        System.out.print("Digite o valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();
        valorCaixa += valorPago;
        System.out.println("Pagamento de R$" + valorPago);
     }

     public void fecharCaixa() {
         System.out.println("Valor em caixa: "+ valorCaixa);
         valorCaixa = 0.0;
         System.out.println("Caixa fechado." );
       
     }

    

    
}
