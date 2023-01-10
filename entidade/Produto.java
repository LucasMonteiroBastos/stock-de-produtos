package entidade;

// classe Produto
public class Produto {
	// atributos da classe
	public String nome;
	public double preco;
	public int quantidade;
	
	//metodo: funcao para calcular o valor total do estoque
	public double totalDeValorNoEstoque( ) {
		return preco * quantidade;
	}
	
	//metodo: funcao para adicionar um produto 
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	//metodo: fancao para remover um produto
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	//metodo: funcao para imprimir as informacoes
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
