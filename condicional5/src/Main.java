import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double total;
        double preco;

        System.out.println("######### CARDÁPIO ##########");
        System.out.println("1 - Cachorro Quente R$10.00");
        System.out.println("2 - X-Salada R$15.00");
        System.out.println("3 - X-Bacon R$18.00");
        System.out.println("4 - Bauru R$12.00");
        System.out.println("5 - Refrigerante R$8.00");
        System.out.println("6 - Suco de laranja R$ 13.00");

        System.out.print("\nEscolha o item a partir do código: ");
        int item = scanf.nextInt();

        System.out.print("Agora escolha a quantidade: ");
        int quantidade = scanf.nextInt();

        switch (item) {
            case 1:
                preco = 10.00;
                total = quantidade * preco;
                System.out.printf("\nProduto: Cachorro Quente" + ", Valor total: R$%.2f%n", total);
                break;
            case 2:
                preco = 15.00;
                total = quantidade * preco;
                System.out.printf("\nProduto: X-Salada" + ", Valor total: R$%.2f%n", total);
                break;
            case 3:
                preco = 18.00;
                total = quantidade * preco;
                System.out.printf("\nProduto: X-Bacon" + ", Valor total: R$%.2f%n", total);
                break;
            case 4:
                preco = 12.00;
                total = quantidade * preco;
                System.out.printf("\nProduto: Bauru" + ", Valor total: R$%.2f%n", total);
                break;
            case 5:
                preco = 8.00;
                total = quantidade * preco;
                System.out.printf("\nProduto: Refrigerante" + ", Valor total: R$%.2f%n", total);
                break;
            case 6:
                preco = 13.00;
                total = quantidade * preco;
                System.out.printf("\nProduto: " + ", Valor total: R$%.2f%n", total);
                break;
            default:
                System.out.print("Número do produto invalido");
                break;
        }

    }
}