import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args){

        // Declara variaveis do km, precoGasolina, kml
        double kml, km, precoGasolina, desconto, total;

        // Define desconto a ser aplicado e o km/l
        desconto = 0.05;
        kml = 12.00;

        //Cria scanner para ler entrada do usuário
        Scanner s = new Scanner(System.in);

        //Solicita entrada do usuário
        System.out.println("Digite a distância da viagem (em km): ");
        km = s.nextDouble();
        System.out.println("Digite o preço da gasolina na sua região: ");
        precoGasolina = s.nextDouble();

        //Calcula preço total da viagem
        total = km/kml;
        total = total * precoGasolina;

        //Verifica se o desconto é aplicável para distância maior de 500km
        if (km > 500.00){
            total = total - (total * desconto);
            System.out.println("Desconto aplicado!");
        }

        // Exibe resultado na tela
        System.out.printf("O resultado total é de: R$ %.2f%n", total);
    }
}
