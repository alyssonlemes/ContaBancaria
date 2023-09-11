import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String nome = "Alysson";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int escolha = 0;
        double recebido = 0;
        double transferido = 0;

        System.out.printf("****************************************************");
        System.out.println("\nDados iniciais do cliente: \n");
        System.out.println("Nome:             " + nome);
        System.out.println("Tipo conta:       " + tipoConta);
        System.out.println("Saldo:            " + saldo);
        System.out.printf("****************************************************");

        String menu = """
          \n\nOperações: 
          1 - Consultar saldos
          2 - Receber valor
          3 - Transferir valor
          4 - Sair 
          """;

        Scanner scanner = new Scanner(System.in);
        while (escolha != 4) {

            System.out.println(menu);
            System.out.println("Digite a opção desejada: \n");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:\n ");
                    recebido = scanner.nextDouble();
                    saldo += recebido;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:\n ");
                    transferido = scanner.nextDouble();
                    if(transferido < saldo) {
                        saldo -= transferido;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    } else{
                        System.out.println("Valor de transferência maior do que o saldo disponível, operação finalizada!!!");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!!!!");
                    break;

            }
        }


    }
}