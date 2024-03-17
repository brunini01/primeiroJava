//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = scanner.nextInt();

        if(n1%n2 == 1){
            System.out.println("O numero é impar");
        }else{
            System.out.println("O numero é par");
        }
    }
}
