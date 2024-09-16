import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        do {
            System.out.print("Informe sua idade :");
            idade = sc.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida. Por favor, insira um valor maior que 0.");
            }
        } while (idade <= 0);
        System.out.println("Idade válida fornecida: " + idade);

        sc.close();
    }
}