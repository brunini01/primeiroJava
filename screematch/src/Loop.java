import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
        System.out.println("Qual a nota de 0 a 10 do filme:");
        nota = leitura.nextDouble();

        //mediaAvaliacao = mediaAvaliacao + nota
        mediaAvaliacao += nota;
    }
    System.out.println("Média de avaliações é: " + mediaAvaliacao/3);
}
}