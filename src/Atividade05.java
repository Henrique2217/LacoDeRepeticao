import java.util.Scanner;
import java.util.Random;
public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroAleatorio = rand.nextInt(100) + 1;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 100 : ");
        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número: " + numeroAleatorio);
            }
        } while (palpite != numeroAleatorio);

        sc.close();
    }
}
