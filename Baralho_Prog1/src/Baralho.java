import java.util.Random;

public class Baralho {
    public Cartas[] cartas;

    public Baralho()throws Exception{
        this.cartas = new Cartas[52];
        try{
            this.setCartas();
        }catch(Exception e){
            System.out.println("Erro ao criar baralho: " + e.getMessage()); 
        }
    }
    
    public void setCartas() throws Exception{
        String naipes[] = {"Copas", "Espadas", "Ouros", "Paus"};
        int index = 0;
        for(int j = 0; j < 4; j++){
            for(int i = 1; i <= 13; i++){
                if(this.cartas[index] != null){
                    throw new Exception("Já existe uma carta nessa posição.");
                }
                try{
                    this.cartas[index] = new Cartas(i, naipes[j]);
                    index++;
                }catch (Exception e){
                    System.out.println("Erro ao criar carta: " + e.getMessage());
                }
            }
        } 
    }public void embaralhaCartas(){
        Random random = new Random();
        for(int i = 0; i < 52; i++){
            int index = random.nextInt(i + 1);

            // Troca as cartas nas posições i e index
            Cartas temp = cartas[i];
            cartas[i] = cartas[index];
            cartas[index] = temp;
        }
    }
}
