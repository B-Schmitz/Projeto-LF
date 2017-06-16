
import java.util.ArrayList;


public class NaoTerminal {
    
    
    private String NaoTerminal;
    
    private ArrayList<String> producoes = new ArrayList<>();

    public String getNaoTerminal() {
        return NaoTerminal;
    }

    public void setNaoTerminal(String NaoTerminal) {
        this.NaoTerminal = NaoTerminal;
    }

    public ArrayList<String> getProducoes() {
        return producoes;
    }

    public void setProducoes(String producoes) {
        this.producoes.add(producoes);
    }
}
