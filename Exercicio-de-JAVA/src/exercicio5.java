public class exercicio5 {

    public static void main(String[] args) {

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
}
