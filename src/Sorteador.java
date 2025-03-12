import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteador {

    public void sorteador(int numeroSorteado) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            if (numeroSorteado > 101) {
                System.out.println("Apenas números de 1 aa 100");
            }


            while (numeroSorteado < 101) {
                Aleatorio numero = new Aleatorio();

                int numeroGerado = numero.sorteadorDeNumeros(1, 101);


                int bilhetePremiado = 10;

                String premioMaior = "Parabéns seu bilhete é o premiado, você ganhou 100 reais de desconto em nossa loja";

                System.out.println("O número sorteado foi : " + numeroGerado);


                if (numeroSorteado == numeroGerado) {
                    System.out.println("🙌 WIIIIN !! Você ganhou um vale compras de R$ 20.00");

                    System.out.println("Qual o número do sorteio que deseja adquirir : ");

                    int numeroDoUsuarioo = scanner.nextInt();

                    sorteador(numeroDoUsuarioo);
                    break;
                } else if (numeroSorteado == numeroGerado & numeroGerado ==
                        bilhetePremiado) {
                    System.out.println(premioMaior);
                    break;
                } else {
                    System.out.println("Não foi dessa vez tente novamente");



                    System.out.println("Qual o número do sorteio que deseja adquirir : ");

                    int numeroDoUsuario = scanner.nextInt();

                    sorteador(numeroDoUsuario);

                    break;
                }


            }


    }


}
