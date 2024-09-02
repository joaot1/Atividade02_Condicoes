import java.util.Scanner;
public class Atividade08_Classificacao_De_Temperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um temperatura em Celsius: ");
        double Temperatura = sc.nextDouble();

        if (Temperatura > 30) {
            System.out.println("Quente.");
        } else if (Temperatura >= 15 && Temperatura <= 30) {
            System.out.println("Agradável.");
        } else {
            System.out.println("Frio.");
        }
    }
}
