import java.util.Scanner;
public class Atividade07_Calculadora_Simples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Peça para o usuário inserir dois números e uma operação.
        System.out.print("Insira o primeiro numero: ");
        double num1 = scanner.nextInt();

        System.out.print("Insira o segundo numero: ");
        double num2 = scanner.nextInt();

        System.out.print("Insira a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double result;

        // Realização da Operação.
        switch (operacao) {
            case '+':
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Resultado: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Resultado: " + result);
                break;
            case '/':
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Resultado: " + result);
            } else {
              System.out.println("Erro: Divisão por zero não é permitido.");
            }
            break;
            default:
                System.out.println("Operação inválida! Por favor, insira uma operação válida (+, -, *, /,).");
        }
        scanner.close();
    }
}
