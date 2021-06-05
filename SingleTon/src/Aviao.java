import java.util.HashSet;
import java.util.Set;

public class Aviao {

    private static Aviao instance = new Aviao();

    private Set<String> assentosDisponiveis;

    private Aviao(){
        this.assentosDisponiveis = new HashSet<>();
        this.assentosDisponiveis.add("A1");
        this.assentosDisponiveis.add("A2");
    }

    public static Aviao getInstance(){

    }

    public boolean bookAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }
}
