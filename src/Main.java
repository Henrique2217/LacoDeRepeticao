import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomesJogadores = new String[5];
        String[] nomesJogadoresB= new String[5];
        Scanner sc = new Scanner(System.in);
        String nomeTimeA = "";
        String nomeTimeb= "";

        System.out.println("Informe o nome do Time A " );
        nomeTimeA = sc.next();

        //inicialização; condição;incremento
        // ++ -> vai somar +1 i =i +1
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Player " + i);
            nomesJogadores[i] = sc.next();
        }

        System.out.println("Informe o nome do Time B " );
        nomeTimeb = sc.next();

        //inicialização; condição;incremento
        // ++ -> vai somar +1 i =i +1
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Player " + i);
            nomesJogadoresB[i] = sc.next();
        }



    }
}