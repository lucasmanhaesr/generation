import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        float bruto;
        float adicional;
        float extra;
        float desconto;
        float liquido;

        System.out.print("Digite seu salário bruto: ");
        bruto = scanf.nextFloat();

        System.out.print("Digite seu adicional noturno: ");
        adicional = scanf.nextFloat();

        System.out.print("Digite suas horas extras: ");
        extra = scanf.nextFloat();

        System.out.print("Digite seus descontos: ");
        desconto = scanf.nextFloat();

        liquido = bruto + adicional + (extra * 5) - desconto;
        System.out.println("Seu salário liquido é de: " + liquido);

    }
}