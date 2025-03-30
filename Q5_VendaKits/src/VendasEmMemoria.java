import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada{
	private List<Produto> produtos;
	
	public VendasEmMemoria() {
		produtos = new ArrayList<>();
		produtos.add(new ProdutoSimples(1, "Caneta", 1.55));
		produtos.add(new ProdutoSimples(2, "Borracha", 1.15));
		produtos.add(new ProdutoSimples(3, "Caderno", 32.99));

		ProdutoKit prodKit = new ProdutoKit(4, "Kit Volta as Aulas");
		prodKit.addProd(produtos.get(0));
		prodKit.addProd(produtos.get(2));
		prodKit.addProd(produtos.get(1));
		produtos.add(prodKit);

	}
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		Produto prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
		umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<Produto> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}

}
