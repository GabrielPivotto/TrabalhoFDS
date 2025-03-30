import java.util.List;

public class VisualizadorDeSomatorio implements Observer {
    private List<Integer> valores;

    public VisualizadorDeSomatorio(List<Integer> valores) {
        this.valores = valores;
    }

    @Override
    public void update() {
        int somatorio = valores.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Somatório atual: " + somatorio);
    }
}
