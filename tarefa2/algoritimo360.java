import java.util.Scanner;

public class algoritimo360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ultimoDia = {20, 19, 20, 20, 21, 21, 22, 22, 22, 22, 21, 21};
        String[] signos = {
            "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
            "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"
        };

        while (true) {
            System.out.print("Digite a data de nascimento (ddmm) ou 9999 para terminar: ");
            int data = sc.nextInt();
            if (data == 9999) {
                break;
            }

            int dia = data / 100;
            int mes = data % 100;

            if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
                System.out.println("Data inválida.");
                continue;
            }

            int indiceSigno = mes - 1;
            if (dia > ultimoDia[indiceSigno]) {
                  indiceSigno = (indiceSigno + 1) % 12;
            }

            System.out.println("Signo: " + signos[indiceSigno]);
        }

        sc.close();
    }
}