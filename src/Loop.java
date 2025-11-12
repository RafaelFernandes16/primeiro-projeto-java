import java.util.Scanner;

public class Loop {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliaçao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme!");
            nota = leitura.nextDouble();
            mediaAvaliaçao += nota;
        }

        System.out.println("Média de avaliaçães " + mediaAvaliaçao/3);


    }

}

