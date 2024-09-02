import java.util.Scanner;
    public class Atividade04_Verificacao_De_Login {
        public static void main(String[] args) {

            String usuarioCorreto = "Joao";
            String senhaCorreta = "123456";

            // Peça para usuário inserir um nome e senha
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite seu usuario: ");
            String usuarioInserido = entrada.nextLine();


            System.out.println("Digite sua senha: ");
            String senhaInserida = entrada.nextLine();

            //Verificação De Login.
            if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
                System.out.println("Login efetuado com sucesso!");
            } else {
                System.out.println("Nome de usuário ou senha incorretos.");
            }
    }
}
