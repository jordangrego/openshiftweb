package ao.co.pirao.rest.entidades;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Retorno {
	private int cod;
	private String descricao;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Retorno [cod=" + cod + ", descricao=" + descricao + "]";
	}

}
