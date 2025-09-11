public class Ingresso {
    
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado;

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Filme: " + nomeFilme +
        " | " + (dublado ? "Dublado" : "Legendado") +
        " | Valor: R$ " + String.format("%.2f", getValor());
    }
    
}
