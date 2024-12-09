import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        Stack<String> pilha =  new Stack<>();
        int menu;

        do{
            System.out.println("\n************** MENU *************");
            System.out.println("1 - Adicionar livro na pilha");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Retirar livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("*********************************");

            System.out.print("\nEntre com a opção desejada: ");
            menu = scanf.nextInt();
            scanf.nextLine();

            if(menu == 0){
                System.out.println("Programa Finalizado!");
                break;
            }

            switch (menu){
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String nome = scanf.nextLine();
                    pilha.push(nome);
                    break;
                case 2:
                    System.out.println("\nPilha de livros: " + pilha);
                    break;
                case 3:
                    if(pilha.isEmpty()){
                        System.out.println("\nPilha vazia");
                    }
                    else{
                        System.out.println("\nLivro foi retirado da pilha: " + pilha.pop());
                        break;
                    }
                default:
                    break;
            }
        }
        while(menu != 0);
        scanf.close();
    }
}