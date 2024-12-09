import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Set<Integer> lista = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            Integer numero = scanf.nextInt();
            lista.add(numero);
        }

        System.out.print("\nElementos do HashSet: [ ");
        lista.forEach(numero -> System.out.print(numero + ", "));
        System.out.print("]");
    }
}