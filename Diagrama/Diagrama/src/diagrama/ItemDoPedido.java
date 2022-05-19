package diagrama;

public class ItemDoPedido {

	private int item;
	private int quantidade;
	private double preco;

	private Pedido pedido;

	public ItemDoPedido() {
	}

	public ItemDoPedido(int item, int quantidade, double preco, Pedido pedido) {
		this.item = item;
		this.quantidade = quantidade;
		this.preco = preco;
		this.pedido = pedido;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public double obterTotalItem() {
		return this.getQuantidade() * this.getPreco();
	}

}
