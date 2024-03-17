//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

import java.util.Scanner;
public class comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = scanner.nextInt();
        System.out.println("Digite o primeiro numero");
        int n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.println("O primeiro numero é maior que o segundo");
        }else if(n2>n1){
            System.out.println("O segundo numero é maior que o primeiro");
        }else{
            System.out.println("Os numeros são iguais");
        }

    }
}
