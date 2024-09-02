import java.util.Scanner;
public class Atividade06_Verificacao_De_Aprovacao_Escolar {
    public static void main(String[] args) {

        // Pedida para o Usuario inserir a nota.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a média do aluno: ");
        double media = sc.nextDouble();

        //Verificação de Média
        if (media >= 7) {
            System.out.println("Aprovado");
        }else if (media >= 5 & media < 7) {
            System.out.println("Recuperação");
        }if (media < 5){
            System.out.println("Reprovado");
        }
    }
}
