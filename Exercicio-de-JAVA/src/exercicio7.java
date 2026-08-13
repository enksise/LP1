import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        // Declara variaveis de dias, km, aluguel, diaria, adicional
        double km, aluguel, diaria, adicional, limite;
        int dias;

        diaria = 300;
        aluguel = diaria;
        limite = 50;
        adicional = 20;

        //Cria scanner para ler entrada do usuário
        Scanner s = new Scanner(System.in);

        //Solicita entrada do usuário
        System.out.println("Digite quantos dias alugou o carro: ");
        dias = s.nextInt();
        System.out.println("Digite quantos km foram percorridos: ");
        km = s.nextDouble();

        if (km > limite) {
            adicional = adicional * (km - limite);
        }

        aluguel = aluguel + adicional;
        System.out.println("Total do aluguel: R$ ");
    }
}
