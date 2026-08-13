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

        //Verifica se ultrapassou o limite de km
        if (km > limite) {
            adicional = adicional * (km - limite);
        }

        //Calcula o aluguel e exibe na tela um resumo do aluguel
        aluguel = aluguel + adicional;
        
        System.out.println("==== RESUMO ===================");
        System.out.println("Dias alugados: " + dias);
        System.out.println("km percorridos: " + km);
        System.out.printf("Diária: R$ %.2f%n", diaria);
        System.out.printf("Adicional: R$ %.2f%n", adicional);
        System.out.printf("Total do aluguel: R$ %.2f%n", aluguel);
        System.out.println("===============================");
    }
}
