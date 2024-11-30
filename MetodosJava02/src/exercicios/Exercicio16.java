package exercicios;

public class Exercicio16 {
	 public static boolean EhPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        
	        System.out.println(EhPrimo(17));  // true
	        System.out.println(EhPrimo(14));  // false
	    }
	
}
