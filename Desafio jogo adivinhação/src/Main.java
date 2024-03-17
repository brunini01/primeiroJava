import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random aleatorio = new Random();
        int randomNumber = aleatorio.nextInt(1+100);
        int erro = 0;
        int tentativa;
        System.out.println(randomNumber);


        for (int i = 0; i < 5 ; i++) {

            System.out.println("Digite um numero inteiro entre 0 e 100:");
            tentativa = leitura.nextInt();
            erro++;
            if (tentativa == randomNumber) {
                System.out.println("Você acertou o numero secreto");
                System.out.println("Voce acertou em " + erro + " Tentativas");
                break;
            }else if(tentativa > randomNumber){
                System.out.println("O numero que voce escolheu é maior que o numero secreto");
            }else{
                System.out.println("O numero que voce escolhe é menor que o numero secreto");
            }

            System.out.println(tentativa);
        }
        System.out.println("Voce excedeu a quantidade limites de tentativas: " + erro);
    }
}