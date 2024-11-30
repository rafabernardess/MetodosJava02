package exercicios;

public class Exercicio13 {
	public static int CalcularAreaRetangulo(int largura, int altura) {
        return largura * altura;
    }

    public static void main(String[] args) {
        int area = CalcularAreaRetangulo(5, 8);
        
        System.out.println("A área do retângulo é: " + area);
    }
}

