import java.util.Scanner;
public class Atividade10_Calculo_Desconto_Progessivo {
    public static void main(String[] args) {

        // Cria o scanner e pede para o usuário inserir um valor.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor total da compra: R$ ");
        double valorTotal = scanner.nextDouble();

        double desconto = 0;
        double valorDescontado;
        double valorFinal;

        // Aplica as regras de desconto progressivo usando condiçoes aninhadas.
        if (valorTotal > 500) {
            desconto = 0.20; //Desconto de 20%
        }else if (valorTotal > 200) {
            desconto = 0.10; //Desconto de 10%
        }else if (valorTotal > 100) {
            desconto = 0.05; //Desconto de 5%
        }else {
            desconto = 0.00; //Sem Desconto.
        }

        //Calcula o valor descontado e o valor final após o desconto.
        valorDescontado = valorTotal * desconto;
        valorFinal = valorTotal - valorDescontado;

        // Informa o valor original, o percentual de desconto aplicado.
        System.out.println ("Valor Original: R$ " + valorTotal);
        System.out.println("Percentual de Desconto: " + (desconto * 100) + "%");
        System.out.println("Valor Descontado: R$ " + valorDescontado);
        System.out.println("Valor Final: R$" + valorFinal);

    scanner.close();
    }
}
