package entidade;

// classe Produto
public class Produto {
	// atributos da classe
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalDeValorNoEstoque( ) {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", preco)
				+ ", " 
				+ quantidade
				+ " units, Total: $ "
				+ String.format("%.2f", totalDeValorNoEstoque());
	}
}
