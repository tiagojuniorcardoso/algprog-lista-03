import java.util.Scanner;

public class Simbolos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, /, ^): ");
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.printf("Resultado: %.2f\n", (num1 + num2));
                break;
            case '-':
                System.out.printf("Resultado: %.2f\n", (num1 - num2));
                break;
            case '*':
                System.out.printf("Resultado: %.2f\n", (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Resultado: %.2f\n", (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case '^':
                System.out.printf("Resultado: %.2f\n", Math.pow(num1, num2));
                break;
            default:
                System.out.println("Símbolo da operação é inválido.");
                break;
        }

        scanner.close();
    }
}
