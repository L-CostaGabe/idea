import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        double l1;
        double l2;
        double areaquadrado;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado 1 do quadrado: ");
        l1 = scanner.nextDouble();
        System.out.print("Digite o valor do lado 2 do quadrado: ");
        l2 = scanner.nextDouble();

        areaquadrado = l1 * l2;

        System.out.println("A área do quadrado é: " + areaquadrado);
        scanner.close();

    }
}
