import java.util.Scanner;
public class Atividade11_Sistema_De_Salario_Com_Bonificao_E_Imposto {
    public static void main(String[] args) {

        // Cria o Scanner, e pede para o usuário digitar um salário bruto.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salario bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        // Pede quantos anos que o funcionário trabalhou na empresa.
        System.out.println("Insira o número de anos de trabalho: ");
        int anosTrabalhados = scanner.nextInt();

        double bonus = 0;
        double imposto = 0;
        double salarioLiquido;
        double salarioComBonus;

        // Aplicação da Regra de bonificação.
        if (anosTrabalhados >= 10) {
            bonus = salarioBruto * 0.10; //Bonus de 10%.
        } else if (anosTrabalhados >= 5) {
            bonus = salarioBruto * 0.05; //Bonus de 5%.
        } else {
            bonus = 0;
        }

        // Aplicação das regras de desconto de imposto
        if (salarioBruto > 5000) {
            bonus = salarioBruto * 0.27; // 27% de Imposto.
        } else if (salarioBruto > 3000) {
            imposto = salarioBruto * 0.18; // 18% de Imposto.
        } else {
            imposto = salarioBruto * 0.10; // 10% de Imposto.
        }

        //Calcula o salário líquido considerando o bônus recebido, o imposto descontado e o salário líquido.
        salarioComBonus = salarioBruto + bonus;
        salarioLiquido = salarioComBonus - imposto;

        //Imprime o Resultado
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Bônus Recebido: R$ " + bonus);
        System.out.println("Imposto Descontado: R$ " + imposto);
        System.out.println("Salário Liquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
