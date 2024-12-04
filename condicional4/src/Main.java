import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Escreva Vertebrado ou Invertebrado: ");
        String caracteristica1 = scanf.nextLine();

        if(caracteristica1.equalsIgnoreCase("vertebrado")) {
            System.out.print("Escreva Ave ou Mamifero: ");
            String caracteristica2 = scanf.nextLine();

            if(caracteristica2.equalsIgnoreCase("Ave")) {
                System.out.print("Escreva Carnivoro ou Onivoro: ");
                String caracteristica3 = scanf.nextLine();
                if (caracteristica3.equalsIgnoreCase("Carnivoro")) {
                    System.out.print("Você escolheu Aguia");
                }
                else {
                    System.out.print("Você escolheu Pomba");
                }
            }
            else{
                System.out.print("Escreva Onivoro ou Herbivoro: ");
                String caracteristica3 = scanf.nextLine();
                if (caracteristica3.equalsIgnoreCase("Onivoro")) {
                    System.out.print("Você escolheu Homem");
                }
                else{
                    System.out.print("Você escolheu Vaca");
                }
            }
        }
        else{
            System.out.print("Escreva Inseto ou Anelideo: ");
            String caracteristica2 = scanf.nextLine();
            if (caracteristica2.equalsIgnoreCase("Inseto")) {
                System.out.print("Escreva Hematofago ou Herbivoro: ");
                String caracteristica3 = scanf.nextLine();
                if (caracteristica3.equalsIgnoreCase("Hematofago")) {
                    System.out.print("Você escolheu Pulga");
                }
                else{
                    System.out.print("Você esccolheu Lagarta");
                }
            }
            else {
                System.out.print("Escreva Hematofago ou Onivoro: ");
                String caracteristica3 = scanf.nextLine();
                if (caracteristica3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("Sanguessuga");
                }
                else{
                    System.out.println("Minhoca");
                }
            }
        }
    }
}