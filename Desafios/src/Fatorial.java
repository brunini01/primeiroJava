//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite o numero para desconbrir o fatorial:");
        int n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {
            fatorial *= i;

        }
        System.out.println(fatorial);
    }
}
