package calculos;
public class AgeDifference {
    public static void main(String[] args) {
        int agePerson1;
        int agePerson2;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Idade da primeira pessoa: ");
        agePerson1 = scanner.nextInt();
        System.out.print("Idade da segunda pessoa: ");
        agePerson2 = scanner.nextInt();

        int ageDifference = Math.abs(agePerson1 - agePerson2);
        System.out.println("A diferença de idade é: " + ageDifference + " anos.");

        scanner.close();
    }
}
