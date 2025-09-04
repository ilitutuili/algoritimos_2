import java.util.Scanner;

public class algoritimo351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        // Entrada dos nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        //sc.close();

        int num;
        do {
            System.out.print("Digite o numero da pessoa (1 a 5): ");
            num = sc.nextInt();
            if (num < 1 || num > 5) {
                System.out.println("Numero fora do intervalo");
            }
        } while (num < 1 || num > 5);

        System.out.println(nomes[num - 1]);

        sc.close();

    }
}