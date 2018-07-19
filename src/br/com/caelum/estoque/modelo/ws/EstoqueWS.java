package br.com.caelum.estoque.modelo.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;

@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();
	
	@WebMethod(operationName="TodosOsItens")
	@WebResult(name="itens")     //<itens><item>celular1</item><item>celular2</item></itens>
	public ListaItens getItens(@WebParam(name="filtro") Filtros filtros){
		List<Item> itens = dao.todosItens();
		return new ListaItens(itens);
	}
	
	@WebMethod(operationName="CadastrarItem")
	@WebResult(name="item")
	public Item cadastraItem(@WebParam(name="token", header=true) TokenUsuario token, 
			@WebParam(name="item") Item item) {
		
		System.out.println("Cadastrando o item " + item);
		boolean valido = new TokenDao().ehValido(token);
		this.dao.cadastrar(item);
		return item;
	}
}
