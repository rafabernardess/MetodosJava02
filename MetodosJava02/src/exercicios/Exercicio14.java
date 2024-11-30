package exercicios;

public class Exercicio14 {
	 public static double CalcularPerimetroCirculo(double raio) {
	        return 2 * Math.PI * raio;
	    }

	    public static void main(String[] args) {
	    double perimetro = CalcularPerimetroCirculo(7.5);
	        
	    System.out.println("O perímetro do círculo é: " + perimetro);
	}
}
