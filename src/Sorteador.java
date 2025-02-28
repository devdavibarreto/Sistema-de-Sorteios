

public class Sorteador {

    public void sorteador(int numeroSorteado) {

        while (numeroSorteado < 100) {
            int numeroGerado = sorteadorDeNumeros();
            System.out.println(numeroGerado);
            if (numeroSorteado == numeroGerado) {
                System.out.println("🙌 WIIIIN !! Você ganhou um carro");
                break;
            } else {
                System.out.println("Não foi dessa vez tente novamente");
                break;
            }

        }


    }

    private int sorteadorDeNumeros() {

    }


}
