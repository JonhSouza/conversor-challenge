import com.br.alura.conversor.controle.Conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int resposta = 1;

        while (resposta != 0) {
            try {
                System.out.println("Digite a moeda base no formato SIGLA (exemplo: BRL/USD/EUR): ");
                String moeda1 = sc.nextLine();
                System.out.println("Digite a moeda de comparação: ");
                String moeda2 = sc.nextLine();
                System.out.println("Digite o valor da moeda base cujo qual você deseja converter: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                conversor.iniciarConversao(moeda1, moeda2, valor);

                System.out.println("Deseja continuar (SIM = 1 / NÃO = 0)?");
                resposta = sc.nextInt();
                sc.nextLine();

                if (resposta == 0) {
                    System.out.println("Finalizando conversor...");
                } else if (resposta != 0 && resposta != 1) {
                    System.out.println("Informe a entrada correta para dar continuidade ou finalizar o programa.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido para o valor da moeda.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println( "Algo de errado aconteceu. Certifique-se de que fez o envio de uma moeda existente com a escrita da sigla corretamente.");
            }


        }



        sc.close();
    }
}
