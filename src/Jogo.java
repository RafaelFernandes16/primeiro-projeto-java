import java.util.Random;
import java.util.Scanner;

public class Jogo {
    static void main(String[] args) {

        Scanner leitor = new  Scanner(System.in);
        int numeroGerador = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero entre 1 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerador) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas " );
                break;
            } else if (numeroDigitado < numeroGerador) {
                System.out.println("O número digitado é maior que número gerado.");

            }else {
                System.out.println("O número digitado é menor que número gerado.");
            }    }
            if (tentativas == 5 && numeroDigitado != numeroGerador){
                System.out.println("Você não coneguiu acertar o número em 05 tentativas. O número era " + numeroGerador);
            }





    }
}
