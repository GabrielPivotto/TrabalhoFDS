import java.util.ArrayList;
import java.util.List;

public class ProdutoKit implements Produto{
    private String nome;
    private int id;
    private List<Produto> lista;

    ProdutoKit(int id, String nome) {
        this.nome = nome;
        lista = new ArrayList<>();
    }

    public void addProd(Produto prod) {
        lista.add(prod);
    }

    public int getId() {return id;}

    public String getNome() {return nome;}
    
    public double getPreco() {
        double count = 0;

        for(Produto prod : lista) {
            count += prod.getPreco();
        }

        return count *1.1;
    }
}
