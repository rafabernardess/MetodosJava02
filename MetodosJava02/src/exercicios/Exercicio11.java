package exercicios;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio11 {

    public static void ExibirHoraAtual() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date horaAtual = new Date();
        System.out.println("Hora atual: " + sdf.format(horaAtual));
    }

    public static void main(String[] args) {
        ExibirHoraAtual();
    }
}

