package exercicios;

public class Exercicio20 {
	 public static double CalcularHipotenusa(double cateto1, double cateto2) {
	        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	    }

	    public static void main(String[] args) {
	      
	        System.out.println(CalcularHipotenusa(3, 4));  // 5.0
	    }
	}

