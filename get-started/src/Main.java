import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);


        System.out.println("Digite o 1º nome: ");
        var name1 = scanner.nextLine();
        System.out.println("Digite o 2º nome: ");
        var name2 = scanner.nextLine();

        System.out.printf("Digite a idade de %s: ", name1);
        var age1 = scanner.nextInt();
        System.out.printf("Digite a idade de %s: ", name2);
        var age2 = scanner.nextInt();
        var ageDifference = Math.abs(age2 - age1);
        System.out.printf("A diferença de idade entre %s e %s é de %s anos.", name1, name2, ageDifference);

        scanner.close();
    }

}