public class IngressoFamilia extends Ingresso {

    private int quantidade;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int quantidade) {
        super(valor, nomeFilme, dublado);
        this.quantidade = quantidade;
    }

    @Override
    public double getValor() {
        double total = valor * quantidade;
        if (quantidade >= 3) {

        }
        return total * 0.95;

    }

    @Override
    public String toString() {
        return super.toString() + " | Pessoas: " + quantidade;
    }

}
