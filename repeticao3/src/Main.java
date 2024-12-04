import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int idade = 1;
        List<Integer> menor = new ArrayList<>();
        List<Integer> maior = new ArrayList<>();

        while (idade > 0) {
            System.out.print("Digite sua idade: ");
            idade = scanf.nextInt();
            if(idade < 21 && idade> 0){
                menor.add(idade);
            }
            else if(idade > 50){
                maior.add(idade);
            }
        }

        System.out.printf("Total de pesoas maior que 21 anos de idade: %d\n", menor.size());
        System.out.printf("Total de pesoas maior que 50 anos de idade: %d\n", maior.size());

    }
}

