import java.util.Scanner;

public class Banco {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String nome = "Gabriel";
        double saldo = 0;
        String menu = """
                        Operações:
                        1 - Consultar saldo.
                        2 - Fazer transferência.
                        3 - Receber transferência.
                        4 - Sair""";

        System.out.println("*********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("\n*********************");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("O saldo atual é de: R$ " + saldo + ".");
                break;

            case 2:
                System.out.println("Digite o valor que deseja transferir:");
                double saida = scanner.nextDouble();
                if (saida > saldo){
                    System.out.println("Você não tem saldo suficiente para essa transferência.");
                    break;
            } else {
                    saldo -= saida;
                    System.out.println("Transferência realizada com sucesso.");
                    System.out.println("Seu saldo atual é de R$ " + saldo + ".");
                    break;
                }
            case 3:
                System.out.println("Digite o valor que deseja receber:");
                double entrada = scanner.nextDouble();
                saldo += entrada;
                System.out.println("O seu saldo atual é de R$ " + saldo);
                break;

            case 4:
                System.out.println("Volte sempre.");
                break;

            default:
                System.out.println("Opção inválida.");
            }
        }

        }
    }
