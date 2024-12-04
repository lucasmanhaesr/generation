import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        float novoSalario;

        System.out.print("Digite seu nome: ");
        String nome = scanf.nextLine();

        System.out.print("Digite o código do cargo: ");
        int cargo = scanf.nextInt();

        System.out.print("Digite o salário: ");
        float salario = scanf.nextFloat();

        switch(cargo){
            case 1:
                novoSalario = salario + ((float) 10 / 100 * salario);
                System.out.println("Nome do colaborador: " + nome + ", Cargo: Gerente, " + "Salário: R$" + novoSalario);
                break;
            case 2:
                novoSalario = salario + ((float) 7 / 100 * salario);
                System.out.println("Nome do colaborador: " + nome + ", Cargo: Vendedor, " + "Salário: R$" + novoSalario);
                break;
            case 3:
                novoSalario = salario + ((float) 9 / 100 * salario);
                System.out.println("Nome do colaborador: " + nome + ", Cargo: Supervisor, " + "Salário: R$" + novoSalario);
                break;
            case 4:
                novoSalario = salario + ((float) 6 / 100 * salario);
                System.out.println("Nome do colaborador: " + nome + ", Cargo: Motorista, " + "Salário: R$" + novoSalario);
                break;
            case 5:
                novoSalario = salario + ((float) 5 / 100 * salario);
                System.out.println("Nome do colaborador: " + nome + ", Cargo: Estoquista, " + "Salário: R$" + novoSalario);
                break;
            case 6:
                novoSalario = salario + ((float) 8 / 100 * salario);
                System.out.println("Nome do colaborador: " + nome + ", Cargo: Técnico de TI, " + "Salário: R$" + novoSalario);
                break;
            default:
                System.out.print("Número do cargo incorreto");
                break;
        }

    }
}