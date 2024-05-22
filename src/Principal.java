import br.com.alura.modelos.ConversorDeMoedas;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        int escolha = 0;

        ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();

        String EUR = "EUR";
        String USD = "USD";
        String BRL = "BRL";
        String ARS = "ARS";

        while(escolha != 7) {
            System.out.println("""
                   *****************
                   Esolha uma opção para realizar a conversão: 
                   1 - EUR => BRL
                   2 - BRL => EUR
                   3 - USD => BRL
                   4 - BRL => USD
                   5 - ARS => USD
                   6 - USD => ARS
                   7 - Sair
                   *****************
                """);

            escolha = leitura.nextInt();

            if (escolha == 7) {
                System.out.println("Sistema de conversão finalizado");
                break;
            } if (escolha < 1|| escolha > 7) {
                System.out.println("Opção inválida!\n" +
                        "Escolha novamente:");
            }

            switch (escolha){
                case 1:
                    System.out.println("Digite o valor: ");
                    double euroConvertido = leitura.nextDouble();
                    conversorDeMoedas.converterMoedas(EUR,BRL,euroConvertido);
                    break;
                case 2:
                    System.out.println("Digite o valor: ");
                    double realConvertidoParaEuro = leitura.nextDouble();
                    conversorDeMoedas.converterMoedas(BRL, EUR ,realConvertidoParaEuro);
                    break;
                case 3:
                    System.out.println("Digite o valor: ");
                    double dolarConvertido = leitura.nextDouble();
                    conversorDeMoedas.converterMoedas(USD, BRL ,dolarConvertido);
                    break;
                case 4:
                    System.out.println("Digite o valor: ");
                    double realConvertidoParaDolar = leitura.nextDouble();
                    conversorDeMoedas.converterMoedas(BRL, USD ,realConvertidoParaDolar);
                    break;
                case 5:
                    System.out.println("Digite o valor: ");
                    double pesoConvertidoParaDolar = leitura.nextDouble();
                    conversorDeMoedas.converterMoedas(ARS, USD ,pesoConvertidoParaDolar);
                    break;
                case 6:
                    System.out.println("Digite o valor: ");
                    double dolarConvertidoParaPeso = leitura.nextDouble();
                    conversorDeMoedas.converterMoedas(USD, ARS ,dolarConvertidoParaPeso);
                    break;
                default:
                    break;
            }
        }
    }
}
