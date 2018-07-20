package br.com.caelum.estoque.modelo.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  //essa anota��o indica que o valor da classe ser� representado como um elemento XML principal;
@XmlAccessorType(XmlAccessType.FIELD) //indica que as anota��es est�o ou nos atributos ou nos m�todos da classe;
public class Filtro {

	private TipoItem tipo;

	private String nome;

	public TipoItem getTipo() {
		return tipo;
	}

	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
