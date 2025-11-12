import java.util.Scanner;

public class Leitura {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digiti seu filme favorito ?");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento ?");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme!");
        double avaliacao = leitura.nextDouble();


        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliacao);

    }


}
