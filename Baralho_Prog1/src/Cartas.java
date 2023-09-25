public class Cartas {
    public int valor;
    public String naipe;  

    public Cartas (int val, String naip) throws Exception{
        if(val < 1 || val > 13){
            throw new Exception("O valor da carta deve estar entre 1 e 13.");
        }if (!naip.equals("Copas") && !naip.equals("Espadas") && !naip.equals("Ouros") && !naip.equals("Paus")) {
            throw new Exception("O naipe da carta deve ser 'Copas', 'Espadas', 'Ouros' ou 'Paus'.");
        }
        this.valor = val;
        this.naipe = naip;        
    }
}
