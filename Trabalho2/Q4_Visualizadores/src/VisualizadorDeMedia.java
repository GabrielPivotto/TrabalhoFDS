import java.util.List;

public class VisualizadorDeMedia implements Observer {
    private List<Integer> valores;

    public VisualizadorDeMedia(List<Integer> valores) {
        this.valores = valores;
    }

    @Override
    public void update() {
        double media = valores.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Média atual: " + media);
    }
}
