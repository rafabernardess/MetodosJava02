package exercicios;

public class Exercicio15 {
	public static int ObterMenorNumero(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
     
        int menor = ObterMenorNumero(10, 20, 5);
       
        System.out.println("O menor número é: " + menor);
    }
}
