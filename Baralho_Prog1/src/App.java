public class App {
    public static void main(String[] args) throws Exception {
        Baralho baralho1 = new Baralho();

        for(int i = 0; i < 52; i++){
            System.out.printf("%d - %s\n", baralho1.cartas[i].valor, baralho1.cartas[i].naipe);
        }
        baralho1.embaralhaCartas();

        System.out.println("EMBARALHA");

        for(int i = 0; i < 52; i++){
            System.out.printf("%d - %s\n", baralho1.cartas[i].valor, baralho1.cartas[i].naipe);
        }
    }
}