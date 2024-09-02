import java.util.Scanner;
public class Atividade09_Verificacao_De_Numero_Positivo_Negativo_Ou_Zero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = sc.nextInt();

        if (numero > 0){
            System.out.println("O número é positivo.");
        }else if (numero < 0){
            System.out.println("O número é negativo.");
        }else{
            System.out.println("O número é zero");
        }
    }
}
