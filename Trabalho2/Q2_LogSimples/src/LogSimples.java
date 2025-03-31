import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class LogSimples implements Iterable<String> {
    private static LogSimples instance;
    private List<String> mensagens;

    public static LogSimples getInstance(){
        if(instance==null) instance = new LogSimples();
        return instance;
    }

    private LogSimples() {
        mensagens = new LinkedList<>();
        instance = null;
    }

    public void log(String m) {
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
