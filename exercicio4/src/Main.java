import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        float numero1;
        float numero2;
        float numero3;
        float numero4;
        float calculo;

        System.out.print("Digite o primeiro numero: ");
        numero1 = scanf.nextFloat();

        System.out.print("Digite o segundo numero: ");
        numero2 = scanf.nextFloat();

        System.out.print("Digite o terceiro numero: ");
        numero3 = scanf.nextFloat();

        System.out.print("Digite o quarto numero: ");
        numero4 = scanf.nextFloat();

        calculo = (numero1 * numero2) - (numero3 * numero4);
        System.out.printf("A diferença é: %.1f%n", calculo);
    }
}