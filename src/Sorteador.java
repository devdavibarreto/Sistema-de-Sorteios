import java.util.concurrent.ThreadLocalRandom;

public class Sorteador {

    public void sorteador(int numeroSorteado) {


        if (numeroSorteado > 100) {
            System.out.println("Apenas números de 1 aa 100");
        }

        while (numeroSorteado < 100) {
            Aleatorio numero = new Aleatorio();

            int numeroGerado = numero.sorteadorDeNumeros(1,100);


            int bilhetePremiado = 10;

            String premioMaior = "Parabéns seu bilhete é o premiado, você ganhou 100 reais de desconto em nossa loja";

            System.out.println("O número sorteado foi : " + numeroGerado);


            if (numeroSorteado == numeroGerado) {
                System.out.println("🙌 WIIIIN !! Você ganhou um vale compras de R$ 20.00");
                break;
            } else if (numeroSorteado == numeroGerado & numeroGerado ==
                    bilhetePremiado) {
                System.out.println(premioMaior);
                break;
            } else {
                System.out.println("Não foi dessa vez tente novamente");
                break;
            }
        }
    }


}
