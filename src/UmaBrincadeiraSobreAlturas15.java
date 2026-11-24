public class UmaBrincadeiraSobreAlturas15 {

    public static void main(String[] Args){

        int alturaAnacleto = 150;   // 1,50 m = 150 cm
        int alturaFelisberto = 110; // 1,10 m = 110 cm

        int anos = 0;

        // Enquanto Felisberto não for maior que Anacleto, o laço continua
        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += 2;   // Cresce 2 cm por ano
            alturaFelisberto += 3; // Cresce 3 cm por ano
            anos++;                // Passa 1 ano
        }

        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
        System.out.printf("Altura final de Anacleto: %.2f m%n", alturaAnacleto / 100.0);
        System.out.printf("Altura final de Felisberto: %.2f m%n", alturaFelisberto / 100.0);

    }

}
