import java.util.LinkedList;
public class DadoLog implements IDados{
    private Dado d;
    private LinkedList<Integer> log;

    public DadoLog(Dado d){
        this.d = d;
        log = new LinkedList<>();
    }

    public void rolar(){
        d.rolar();
        log.add(d.getValor());
    }

    public int getValor(){
        return d.getValor();
    }

    public LinkedList<Integer> getLog(){
        return log;
    }
}
