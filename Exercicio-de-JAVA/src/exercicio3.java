import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double arroz, feijao, oleo, acucar, cafe, macarrao, farinha, fuba, molho, sal, compra, desconto;
        int opcao, quant;

        compra = 0;
        desconto = 0.1;
        arroz = 6.50;
        feijao = 13.00;
        oleo = 6.50;
        acucar = 4.50;
        cafe = 29.00;
        macarrao = 4.50;
        farinha = 5.00;
        fuba = 4.00;
        molho = 3.50;
        sal = 2.50;

        Scanner s = new Scanner(System.in);

        //Cria menu
        while(true) {
            System.out.println("====== MENU DE COMPRAS =======");
            System.out.println("0. Encerrar Compra");
            System.out.println("1. Arroz (1,5kg)");
            System.out.println("2. Feijão Preto (2kg)");
            System.out.println("3. Óleo de Soja (900ml)");
            System.out.println("4. Açúcar Refinado (1kg)");
            System.out.println("5. Café Torrado e moído (500g)");
            System.out.println("6. Macarrão espaguete (500g)");
            System.out.println("7. Farinha de Trigo (1kg)");
            System.out.println("8. Fubá de milho (500g)");
            System.out.println("9. Molho ou extrato de tomate (300g)");
            System.out.println("10. Sal refinado (1kg)");
            System.out.println();
            System.out.println("Digite uma opção: ");

            opcao = s.nextInt();

            switch (opcao){

                case 0:
                    System.out.println("Compra Encerrada!!");
                    System.out.println();
                    System.out.println("========= TOTAL ==============");
                    System.out.printf("Valor total da compra: %.2f%n", compra);
                    if (compra > 100){
                        compra =  compra - (compra*desconto);
                    }
                    System.out.printf("Valor Total com desconto: %.2f%n",compra);
                    s.close();
                    return;

                case 1:
                    System.out.printf("Preço base: R$ %.2f%n", arroz);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + arroz*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 2:
                    System.out.printf("Preço base: R$ %.2f%n", feijao);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + feijao*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 3:
                    System.out.printf("Preço base: R$ %.2f%n", oleo);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + oleo*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 4:
                    System.out.printf("Preço base: R$ %.2f%n", acucar);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + acucar*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 5:
                    System.out.printf("Preço base: R$ %.2f%n", cafe);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + cafe*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 6:
                    System.out.printf("Preço base: R$ %.2f%n", macarrao);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + macarrao*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 7:
                    System.out.printf("Preço base: R$ %.2f%n", farinha);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + farinha*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 8:
                    System.out.printf("Preço base: R$ %.2f%n", fuba);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + fuba*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 9:
                    System.out.printf("Preço base: R$ %.2f%n", molho);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + molho*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                case 10:
                    System.out.printf("Preço base: R$ %.2f%n", sal);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + sal*quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n",compra);
                    System.out.println();
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
            }
        }
    }
}
