//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Film {

    static void main(String[] args) {
        IO.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLançamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLançamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
// Médeia calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinope;
        sinope = """
            Filme Top Gun
            Filme de aventura com galã dos anos 80
            Muito bom!
            Ano de lançamento
            """ + anoDeLançamento;
        System.out.println(sinope);

      int classicacao = (int) (media /2);
        System.out.println(classicacao);

    }

}