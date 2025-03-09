import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
try {
    System.out.println("Qual o número do sorteio que deseja adquirir : ");
    int numeroEscolhido = scanner.nextInt();

    Sorteador usuario = new Sorteador();

    usuario.sorteador(numeroEscolhido);
}catch (InputMismatchException  e){}

        System.out.println("Apenas números");

    }
}
