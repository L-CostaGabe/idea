package conta_bank;

public class ContaBancaria {

    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        if (saldoInicial <= 500.0) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = saldoInicial * 0.5;
        }
        this.chequeEspecialUsado = 0.0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial - chequeEspecialUsado;
    }

    public void depositar(double valor) {
        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.2;
            double totalDivida = chequeEspecialUsado + taxa;
            if (valor >= totalDivida) {
                valor -= totalDivida;
                chequeEspecialUsado = 0;
            } else {
                chequeEspecialUsado -= valor / 1.2;
                valor = 0;
            }
        }
        saldo += valor;
    }

    public boolean sacar(double valor) {
        double saldoDisponivel = saldo + consultarChequeEspecial();
        if (valor <= saldoDisponivel) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                double restante = valor - saldo;
                saldo = 0;
                chequeEspecialUsado += restante;
            }
            return true;
        }
        return false;
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }

    public boolean usandoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }

}
