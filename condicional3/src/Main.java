import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanf.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanf.nextInt();

        System.out.print("Digite 1 caso seja a primeira doação, caso não aplique digite 0: ");
        int doacao = scanf.nextInt();

        boolean doacoes;

        doacoes = doacao != 0;


        if (idade < 18 || idade > 69) {
            System.out.println("Idade não permitida para doações");
        }
        else if ((idade >= 60 || idade <= 69) && !doacoes) {
            System.out.println("Não está apto para doar sangue");
        }
        else if ((idade >= 60 || idade <= 69) && doacoes) {
            System.out.println("Está apto para doar sangue");
        }
        else{
            System.out.println("Não está Apto para doar sangue");
        }
    }
}