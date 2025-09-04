import java.util.Scanner;

public class algoritimo354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];

        // Entrada dos números
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite " + (i + 1) + "º numero: ");
            num[i] = sc.nextInt();
        }

        // Saída dos dados
        System.out.println("\nRELACAO DOS NUMEROS");
        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + " - " + num[i]);
            if (num[i] % 2 == 0) {
                System.out.println(" é PAR");
            } else {
                System.out.println(" é IMPAR");
            }
        }
        sc.close();
    }
}
  