package exercicios;
import java.util.Random;

public class Exercicio17 {
	public static int GerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1;  // Gera número entre 1 e 100
    }

    public static void main(String[] args) {
        
        System.out.println(GerarNumeroAleatorio());
    }
}
