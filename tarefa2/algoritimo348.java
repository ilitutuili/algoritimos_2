import java.util.Scanner;

public class algoritimo348 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] nomes = new String[5];
            double[] pr1 = new double[5];
            double[] pr2 = new double[5];
            double[] media = new double[5];

            // Entrada de dados
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite " + (i + 1) + "º nome: ");
                nomes[i] = sc.nextLine();
                System.out.print("Digite 1ª nota: ");
                pr1[i] = sc.nextDouble();
                System.out.print("Digite 2ª nota: ");
                pr2[i] = sc.nextDouble();
                media[i] = (pr1[i] + pr2[i]) / 2;
                sc.nextLine(); // Limpa o buffer
            }

            // Saída dos dados
            System.out.println("\n\t\tRELACAO FINAL\n");
            System.out.println("Nome\t\tNota 1\tNota 2\tMédia");
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s\t\t%.2f\t%.2f\t%.2f\n", nomes[i], pr1[i], pr2[i], media[i]);
            }
        }
    }
}