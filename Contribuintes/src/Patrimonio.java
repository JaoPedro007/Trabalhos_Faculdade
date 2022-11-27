
public class Patrimonio {
	private String cpf;
	private String descricao;
	private Double valor;
	


	public Patrimonio(String cpf, String descricao, Double valor) {
		this.cpf= cpf;
		this.descricao = descricao;
		this.valor = valor;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	  
}
