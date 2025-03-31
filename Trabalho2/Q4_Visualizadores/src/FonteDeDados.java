import java.util.ArrayList;
import java.util.List;

public class FonteDeDados implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Integer> valores = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    @Override
    public List<Integer> getValores() {
        return valores;
    }

    public void addValor(int valor) {
        valores.add(valor);
        notifyObservers();
    }
}