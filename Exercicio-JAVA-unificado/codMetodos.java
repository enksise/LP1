import java.util.Scanner;

public class codigoMenu {

    static Scanner s = new Scanner(System.in);

    public static void multiplo() {
        // Declara tipo da variável e cria scanner
        int n1, n2;

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

    public static void login() {
        //Declara variaveis da senha e da entrada do usuário
        String senha, tentativa;
        senha = "1234";

        while (true) {
            //Solicita tentativa de senha do usuário
            System.out.println("Digite a senha: ");
            tentativa = s.nextLine();

            //Verifica se a senha está correta
            if (tentativa.equals(senha)) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Acesso Negado. Tente novamente");
            }
        }
    }

    public static void SistemaCompra() {
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

        //Cria menu
        while (true) {
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

            switch (opcao) {

                case 0:
                    System.out.println("Compra Encerrada!!");
                    System.out.println();
                    System.out.println("========= TOTAL ==============");
                    System.out.printf("Valor total da compra: %.2f%n", compra);
                    if (compra > 100) {
                        compra = compra - (compra * desconto);
                    }
                    System.out.printf("Valor Total com desconto: %.2f%n", compra);
                    s.close();
                    return;

                case 1:
                    System.out.printf("Preço base: R$ %.2f%n", arroz);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + arroz * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 2:
                    System.out.printf("Preço base: R$ %.2f%n", feijao);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + feijao * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 3:
                    System.out.printf("Preço base: R$ %.2f%n", oleo);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + oleo * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 4:
                    System.out.printf("Preço base: R$ %.2f%n", acucar);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + acucar * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 5:
                    System.out.printf("Preço base: R$ %.2f%n", cafe);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + cafe * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 6:
                    System.out.printf("Preço base: R$ %.2f%n", macarrao);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + macarrao * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 7:
                    System.out.printf("Preço base: R$ %.2f%n", farinha);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + farinha * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 8:
                    System.out.printf("Preço base: R$ %.2f%n", fuba);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + fuba * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 9:
                    System.out.printf("Preço base: R$ %.2f%n", molho);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + molho * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                case 10:
                    System.out.printf("Preço base: R$ %.2f%n", sal);
                    System.out.println("Digite a quantidade do seu pedido: ");
                    quant = s.nextInt();
                    compra = compra + sal * quant;
                    System.out.println("Item inserido com sucesso!");
                    System.out.printf("Compra Parcial: %.2f%n", compra);
                    System.out.println();
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
            }
        }
    }

    public static void VerificarTemperatura() {
        double temp, base, media;
        int quant;
        String entrada;

        base = 18.00;
        quant = 0;
        temp = 0;
        media = 0;

        while (true) {
            System.out.println("Digite a temperatura aferida ou 'concluir': ");
            entrada = s.nextLine();

            if (entrada.equalsIgnoreCase("concluir")) {
                media = media / quant;
                System.out.printf("Temperatura Média: %.2f%n", media);
                if (media < base) {
                    System.out.println("Frio.");
                    System.out.println();
                } else {
                    System.out.println("Temperatura Agradável.");
                    System.out.println();
                }
                break;
            } else {
                temp = Double.parseDouble(entrada);
                quant = quant + 1;
                media = media + temp;
                if (media < base) {
                    System.out.println("Frio.");
                    System.out.println();
                } else {
                    System.out.println("Temperatura Agradável.");
                    System.out.println();
                }
            }
        }
    }

    public static void camelos35(){
        // Declara variaveis dos camelos e da parte de cada individuo
        double camelos, irmao1, irmao2, irmao3, beremiz;

        //Quantidade de camelos e parte de cada irmão
        camelos = 35;
        irmao1 = 1.0/2;
        irmao2 = 1.0/3;
        irmao3 = 1.0/9;

        // Camelo extra que Beremiz trouxe
        camelos = camelos + 1;

        //Quantidade que cada irmão receberá
        irmao1 = irmao1 * camelos;
        irmao2 = irmao2 * camelos;
        irmao3 = irmao3 * camelos;

        //Sobra 2 camelos que retornarão a Beremiz pois cada irmão já havia recebido sua parte
        beremiz = camelos - (irmao1 + irmao2 + irmao3);

        System.out.println("==== DISTRIBUIÇÃO: =======");
        System.out.printf("1° irmão: %.0f camelos%n",irmao1);
        System.out.printf("Hamed Narim: %.0f camelos%n",irmao2);
        System.out.printf("Harim: %.0f camelos%n",irmao3);
        System.out.printf("Beremiz: %.0f camelos%n",beremiz);
        System.out.println("==========================");
    }

    public static void calculadoraViagem(){
        // Declara variaveis do km, precoGasolina, kml
        double kml, km, precoGasolina, desconto, total;

        // Define desconto a ser aplicado e o km/l
        desconto = 0.05;
        kml = 12.00;

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

    public static void aluguelCarro(){
        // Declara variaveis de dias, km, aluguel, diaria, adicional
        double km, aluguel, diaria, adicional, limite;
        int dias;

        diaria = 300;
        aluguel = diaria;
        limite = 50;
        adicional = 20;

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
