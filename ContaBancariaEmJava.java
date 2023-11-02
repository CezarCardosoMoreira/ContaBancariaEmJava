import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Cezar Constantino Cardoso Moreira";
        String conta = "Conta Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        double valorReceber = 0;
        double valorTransferir = 0;
        boolean condicaoVerdadeiro = true;

        System.out.println("********************************************************");
        System.out.println("Dados iniciais do Cliente:");
        System.out.println("Nome:            " + nome);
        System.out.println("Tipo de conta:   " + conta);
        System.out.println("Saldo inicial:   " + saldo);
        System.out.println("********************************************************");

        while (condicaoVerdadeiro == true) {
            System.out.println("""
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(saldo);
                System.out.println("   ");

            } else if (opcao == 2) {
                System.out.println("Informe o valor a Receber:");
                valorReceber = leitura.nextDouble();
                saldo += valorReceber;
                System.out.println("Valor recebido com sucesso! " + valorReceber);
                System.out.println("seu saldo é: " + saldo);
                System.out.println("   ");

            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                valorTransferir = leitura.nextDouble();

                if (valorTransferir > saldo) {
                    System.out.println("Saldo insulficiente!" + saldo);
                    System.out.println("   ");

                }else {
                    saldo -= valorTransferir;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("seu saldo é: " + saldo );
                    System.out.println("   ");

                }

            } else if (opcao == 4) {
                System.out.println("Agradecemos sua preferencia, volte sempre!");
                break;
            }
            else {
                System.out.println("Opção invalida!");
                System.out.println("   ");
            }
        }

        }


}
