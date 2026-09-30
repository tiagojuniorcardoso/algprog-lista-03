import java.util.Scanner;

public class Numeromm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        // Maior número
        double maior = num1;
        if (num2 > maior) maior = num2;
        if (num3 > maior) maior = num3;

        // Menor número
        double menor = num1;
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;

        // Média aritmética
        double media = (num1 + num2 + num3) / 3;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("a. Maior número: " + maior);
        System.out.println("b. Menor número: " + menor);
        System.out.printf("c. Média aritmética: %.2f\n", media);

        scanner.close();
    }
}