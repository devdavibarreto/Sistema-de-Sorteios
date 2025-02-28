import java.util.Locale;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o número do sorteio que deseja adquirir : ");
        int numeroEscolhido = scanner.nextInt();

        Sorteador usuario = new Sorteador();

        usuario.sorteador(numeroEscolhido);

    }
}
