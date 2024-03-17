//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = 0;

        System.out.println("Qual tabuada voce deseja");
        int tabuada = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            var++;
            System.out.println(tabuada + "X" + var + "=" + tabuada * var);
        }
    }
}
