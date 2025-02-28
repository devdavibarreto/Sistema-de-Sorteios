import java.util.concurrent.ThreadLocalRandom;

public class Sorteador {

    public void sorteador(int numeroSorteado) {

        while (numeroSorteado < 100) {
            int numeroGerado = sorteadorDeNumeros();
            System.out.println(numeroGerado);
            if (numeroSorteado == numeroGerado) {
                System.out.println("🙌 WIIIIN !! Você ganhou um carro");
                break;
            }else if(numeroSorteado == numeroGerado & numeroGerado == 10){
                System.out.println("Parabéns seu bilhete é o premiado você ganhou um lindo APARTAMENTO");
            } else {
                System.out.println("Não foi dessa vez tente novamente");
                break;
            }

        }


    }

    private int sorteadorDeNumeros() {
return ThreadLocalRandom.current().nextInt(1,101);
    }


}
