 
    
import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        int valorCompra = scanner.nextInt();

        System.out.print("Valor pago: R$ ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco + ",00");

            int tempTroco = troco;

            int notas50 = tempTroco / 50;
            tempTroco %= 50;

            int notas20 = tempTroco / 20;
            tempTroco %= 20;

            int notas10 = tempTroco / 10;
            tempTroco %= 10;

            int notas5 = tempTroco / 5;
            tempTroco %= 5;

            int notas2 = tempTroco / 2;
            tempTroco %= 2;

            int notas1 = tempTroco;

            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        scanner.close();
    }
}
