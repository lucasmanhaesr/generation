import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float saldo = 1000.00f;

        System.out.println("### BANCO ###");
        System.out.println("1 Saldo");
        System.out.println("2 Saque");
        System.out.println("3 Depósito");

        System.out.print("\nDigite a operação: ");
        int operacao = scanf.nextInt();


        switch (operacao) {
            case 1:
                System.out.print("Saldo: " + saldo);
                break;
            case 2:
                System.out.print("Digite o valor do saque: ");
                float valor = scanf.nextFloat();
                if(valor > saldo) {
                    System.out.println("\nSaldo insuficiente");
                }
                else {
                    saldo -= valor;
                }
                System.out.println("Saldo: " + saldo);
                break;
            case 3:
                System.out.print("Digite o valor do depósito: ");
                float deposito = scanf.nextFloat();
                saldo += deposito;
                System.out.println("Saldo: " + saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
    }
}