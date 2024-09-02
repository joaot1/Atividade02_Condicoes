public class Atividade02_Classificacao_De_Notas {
    public static void main(String[] args) {


        double notaAluno = 9.5;

        // Classifição de Notas
        if (notaAluno >= 9) {
            System.out.println("Excelente.");
        }else if (notaAluno >= 7) {
            System.out.println("Boa.");
        }if (notaAluno >= 5) {
            System.out.println("Satisfatório");
        }else if (notaAluno < 5) {
            System.out.println("Insastisfatória.");
        }
    }
}
