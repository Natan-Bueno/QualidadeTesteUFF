package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;
import processador.Processador;
import processador.Processador;

@DisplayName("Testes no pacote carrinho")
public class carrinho_teste {
	Processador produto;
	Boleto carr;
	
	@BeforeEach
	public void inicializa() {
		carr = new Boleto();
	}

	@DisplayName("Testa adição de itens no carrinho")
	@Test
	public void testaAddItem() {
		produto = new Processador("Fralda",10.50);
		carr.addItem(produto);
		int quantidadeDeProdutos = carr.getQtdeItems();
		Assertions.assertEquals(quantidadeDeProdutos, 1);		
	}
	
	@DisplayName("Testa obter valor total")
	@Test
	public void testaGetValorTotal() {
		produto = new Processador("Fralda",10.50);
		carr.addItem(produto);
		double valorTotal = carr.getValorTotal();
		Assertions.assertEquals(valorTotal, 10.50);		
	}
	
	@DisplayName("Testa obter quantidade itens")
	@Test
	public void testaGetQtdeItems() {
		produto = new Processador("Fralda",10.50);
		carr.addItem(produto);
		int quantidadeDeItems = carr.getQtdeItems();
		Assertions.assertEquals(quantidadeDeItems, 1);		
	}
	
	
	@DisplayName("Testa remover itens no carrinho")
	@Test
	public void testaRemoveItem() {
		try {
			produto = new Processador("Fralda",10.50);
			carr.removeItem(produto);
		}catch (ProdutoNaoEncontradoException e) {
			int quantidadeDeItems = carr.getQtdeItems();
			Assertions.assertEquals(quantidadeDeItems, 0);	
		}		
	}
	
	@DisplayName("Testa esvazia carrinho")
	@Test
	public void testaEsvazia() {
		produto = new Processador("Fralda",10.50);
		carr.addItem(produto);
		carr.esvazia();
		int quantidadeDeItems = carr.getQtdeItems();
		Assertions.assertEquals(quantidadeDeItems, 0);		
	}
	
	
}
