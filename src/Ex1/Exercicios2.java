package Ex1;
import java.util.Scanner;

public class Exercicios2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();

            double media = (n1 + n2) / 2.0;
            System.out.printf("Os números sao %d e %d e a média aritmética é %.2f%n", n1, n2, media);
        }
    }

