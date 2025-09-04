import java.util.Scanner;

public class algoritimo346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Comprimento da frase: " + frase.length());
                    break;
                case 2:
                    if (frase.length() >= 2) {
                        String primeiros = frase.substring(0, 2);
                        String ultimos = frase.substring(frase.length() - 2);
                        System.out.println("Primeiros dois: " + primeiros);
                        System.out.println("Últimos dois: " + ultimos);
                    } else {
                        System.out.println("A frase deve ter pelo menos 2 caracteres.");
                    }
                    break;
                case 3:
                    StringBuilder sb = new StringBuilder(frase);
                    System.out.println("Frase espelhada: " + sb.reverse().toString());
                    break;
                case 4:
                    System.out.println("Algoritmo finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}