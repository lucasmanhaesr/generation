import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;


        System.out.print("Digite sua primeira nota: ");
        nota1 = scanf.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        nota2 = scanf.nextFloat();

        System.out.print("Digite sua terceira nota: ");
        nota3 = scanf.nextFloat();

        System.out.print("Digite sua quarta nota: ");
        nota4 = scanf.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Média: %.1f%n", media);

    }
}