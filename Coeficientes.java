import java.util.Scanner;

public class Coeficientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o coeficiente 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Informe o coeficiente 'b': ");
        double b = scanner.nextDouble();

        System.out.print("Informe o coeficiente 'c': ");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau");
            double raiz = -c / b;
            System.out.printf("Raiz real: %.2f\n", raiz);
        } else {
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double x = -b / (2 * a);
                System.out.printf("x1 = x2 = %.2f\n", x);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            }
        }

        scanner.close();
    }
}
