import java.util.Scanner;
//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
// exiba "Número positivo", caso contrário, exiba "Número negativo".
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 = scanner.nextInt();

        if(n1 > 0){
            System.out.println("O numero é positivo");
        }else if(n1 < 0){
            System.out.println("o numero é negativo");
        }else{
            System.out.println("O numero é zero");
        }
    }
}