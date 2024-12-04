import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("### CÁLCULADORA ###");
        System.out.println("1 Soma");
        System.out.println("2 Subtração");
        System.out.println("3 Multiplicação");
        System.out.println("4 Divisão");

        System.out.print("\nDigite o primeiro numero: ");
        float num1 = scanf.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float num2 = scanf.nextFloat();

        System.out.print("Digite o numero da operação: ");
        int operacao = scanf.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Divisão: " + num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Número da operação incorreto");

        }
    }
}