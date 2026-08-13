import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){

        // Declara tipo da variável e cria scanner
        int n1, n2;
        Scanner s = new Scanner(System.in);

        //Solicita entrada do usuário
        System.out.println("Digite número base: ");
        n1 = s.nextInt();
        System.out.println("Digite o mútiplo: ");
        n2 = s.nextInt();

        if (n1 % n2 == 0){
            System.out.println(n1 + " é múltiplo de " + n2);
        }else{
            System.out.println(n1 + " não é múltiplo de " + n2);
        }
    }
}
