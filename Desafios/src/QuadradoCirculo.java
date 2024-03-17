//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
import java.util.Scanner;
public class QuadradoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Calcular área de um Quadrado");
        System.out.println("2-Calcular área de um Circulo");
        System.out.println("Qual opção voce deseja? 1 ou 2");
        int opcao = scanner.nextInt();
        double pi = 3.1416;

        if(opcao == 1){
            System.out.println("Digite o valor do lado do quadrado");
            double quadrado = scanner.nextDouble();
            System.out.println(quadrado*quadrado);
        }else if(opcao==2){
            System.out.println("Digite o valor do raio do circulo");
            double circulo = scanner.nextDouble();
            System.out.println(pi*(circulo*circulo));
        }else{
            System.out.println("Opção incorreta");
        }
    }
}
