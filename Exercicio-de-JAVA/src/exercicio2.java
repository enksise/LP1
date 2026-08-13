import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args){

        //Declara variaveis da senha e da entrada do usuário
        String senha, tentativa;
        Scanner s = new Scanner(System.in);

        senha = "1234";

        while (true) {
            //Solicita tentativa de senha do usuário
            System.out.println("Digite a senha: ");
            tentativa = s.nextLine();

            //Verifica se a senha está correta
            if (tentativa.equals(senha)) {
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Acesso Negado. Tente novamente");
            }
        }
    }
}
