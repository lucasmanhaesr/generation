import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        float salario;
        float novoSalario;
        float abono;

        System.out.print("Digite seu salário: ");
        salario = scanf.nextFloat();

        System.out.print("Digite o abono salarial: ");
        abono = scanf.nextFloat();
        
        novoSalario = salario + abono;
        System.out.printf("Salario com abono: %.1f%n", novoSalario);
    }
}