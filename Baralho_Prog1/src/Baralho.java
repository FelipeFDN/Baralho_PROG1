public class Baralho {
    public Cartas[] cartas;

    public Baralho(){
        this.cartas = new Cartas[52];
        this.setCartas();
    }public void setCartas(){
        String naipes[] = {"Copas", "Espadas", "Ouros", "Paus"};
        int index = 0;
        for(int j = 0; j < 4; j++){
            for(int i = 1; i <= 13; i++){
                this.cartas[index] = new Cartas(i, naipes[j]);
                index++;
            }
        } 
    }
}
