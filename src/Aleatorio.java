
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {

    public int sorteadorDeNumeros(int numeroinicial , int numeroFinal) {

        return ThreadLocalRandom.current().nextInt(numeroinicial, numeroFinal);

}

}
