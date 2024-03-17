public class Main {
        public static void main(String[] args) {
                System.out.println("Este é o Screen Match");
                System.out.println("Filme: Top Gun:Maverick");

                int anoDeLancamento = 2022;
                System.out.println("Ano de Lançamento:" + anoDeLancamento);

                boolean incluidoNoPlano = true;
                double notaDoFilme = 8.1;

                double media = (9.5 + 6.0 + 4) / 3;
                System.out.println(media);

                java.lang.String sinopse;
                sinopse = """   
                                Filme topgun
                                Filme limitadissimo dos anos 90
                                meio ruim
                        """;
                System.out.println(sinopse);

                double classificacao = media / 2;
                System.out.println(classificacao);

        }
}