package exercicios;

public class Exercicio19 {
	 public static String InverterString(String texto) {
	        StringBuilder sb = new StringBuilder(texto);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        
	        System.out.println(InverterString("Ayrton Senna"));  // avaJ
	    }
}
