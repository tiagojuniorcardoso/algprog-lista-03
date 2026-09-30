import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Sorteia um número no intervalo [menor, maior] inclusivo
        int sorteado = random.nextInt((maior - menor) + 1) + menor;

        if (sorteado % 2 == 0) {
            System.out.println("Número gerado: " + sorteado + " (é um número PAR)");
        } else {
            System.out.println("Número gerado: " + sorteado + " (é um número ÍMPAR)");
        }

        scanner.close();
    }
}
