import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){

        double temp, base, media;
        int quant;
        String entrada;
        Scanner s = new Scanner(System.in);

        base = 18.00;
        quant = 0;
        temp = 0;
        media = 0;

        while (true){
            System.out.println("Digite a temperatura aferida ou 'concluir': ");
            entrada = s.nextLine();

            if (entrada.equalsIgnoreCase("concluir")){
                media = media/quant;
                System.out.printf("Temperatura Média: %.2f%n",media);
                if (media < base){
                    System.out.println("Frio.");
                    System.out.println();
                }else {
                    System.out.println("Temperatura Agradável.");
                    System.out.println();
                }
                break;
            }else{
                temp = Double.parseDouble(entrada);
                quant = quant +1;
                media = media + temp;
                if (media < base){
                    System.out.println("Frio.");
                    System.out.println();
                }else {
                    System.out.println("Temperatura Agradável.");
                    System.out.println();
                }
            }
        }
    }
}
