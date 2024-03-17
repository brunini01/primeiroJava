import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Bruno de Oliveira";
        double saldo = 2500.00;
        String conta = "Corrente";
        int opcao = 0;

        System.out.println("****************************************** \n");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome:               " + nome);
        System.out.println("Tipo conta:         " + conta);
        System.out.println("Saldo Inicial:      " + saldo + "\n");
        System.out.println("****************************************** \n \n");

        String menu = """
                **Digite sua opção**
                1- Consultar saldo
                2- Transferir Valor
                3- Receber Valor                
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?");
                double transferir = scanner.nextDouble();

                if (transferir > saldo) {
                    System.out.println("Não há saldo suficiente para essa transferência");
                } else{
                    saldo -= transferir;
                    System.out.println("O saldo atualizado é:" + saldo);}
                }else if (opcao == 3) {
                    System.out.println("Qual o valor que será recebido?");
                    double recebido = scanner.nextDouble();
                    saldo += recebido;
                    System.out.println("O saldo atualizado é:" + saldo);
                } else if (opcao != 4) {
                    System.out.println("Opção Invalida");
                }
            }
        }
    }
