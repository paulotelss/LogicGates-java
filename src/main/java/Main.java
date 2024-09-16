import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores para A (0s e 1s, separados por espaço):");
        boolean[] A = parseBooleanArray(scanner.nextLine());

        System.out.println("Digite os valores para B (0s e 1s, separados por espaço):");
        boolean[] B = parseBooleanArray(scanner.nextLine());

        System.out.println("Digite os valores para Y (0s e 1s, separados por espaço):");
        boolean[] Y = parseBooleanArray(scanner.nextLine());

        GateIdentifier identifier = new GateIdentifier();
        String gateName = identifier.identifyGate(A, B, Y);

        System.out.println("A porta identificada é: " + gateName);
    }

    private static boolean[] parseBooleanArray(String input) {
        String[] tokens = input.split(" ");
        boolean[] array = new boolean[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            array[i] = tokens[i].equals("1");
        }
        return array;
    }
}
