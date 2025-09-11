package conta_bank;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial ao usuário
        System.out.print("Digite o saldo inicial da conta: R$ ");
        double saldoInicial = scanner.nextDouble();

        // Cria a conta com o saldo informado
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao;
        do {
            // Exibe menu de operações
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Cheque especial disponível: R$ " + conta.consultarChequeEspecial());
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 4:
                    System.out.println("\n--- Informações antes do saque ---");
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    System.out.println("Cheque especial disponível: R$ " + conta.consultarChequeEspecial());
                    System.out.println("Total disponível para saque: R$ "
                            + (conta.consultarSaldo() + conta.consultarChequeEspecial()));
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("\n| Saque realizado com sucesso! |");
                    } else {
                        System.out.println("\n| Saldo insuficiente! |");
                    }
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$ ");
                    double boleto = scanner.nextDouble();
                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto!");
                    }
                    break;
                case 6:
                    if (conta.usandoChequeEspecial()) {
                        System.out.println("A conta está usando cheque especial!");
                    } else {
                        System.out.println("A conta NÃO está usando cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
