package calculos;
import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        double base;
        double altura;
        double arearetangulo;

        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o valor da base do retângulo: ");
        base = scanner.nextDouble();
        System.out.print("Digite o valor da altura do retângulo: ");
        altura = scanner.nextDouble();

        arearetangulo = base * altura;

        System.out.println("A área do retângulo é: " + arearetangulo);
        scanner.close();
    }
}