import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanf.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O número é par");
        }
        else {
            System.out.print("O número é impar");
        }

        if (numero < 0) {
            System.out.println(" e negativo");
        }
        else {
            System.out.println(" e positivo");
        }

    }
}