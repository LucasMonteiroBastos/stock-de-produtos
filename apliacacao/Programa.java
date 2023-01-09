package apliacacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.nome = sc.nextLine();
		System.out.print("Price: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Product Data" + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.println("Enter the number of produtos to be remove from stock: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		
		sc.close();
	}

}
