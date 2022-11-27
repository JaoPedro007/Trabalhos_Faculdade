import java.util.ArrayList;
import java.util.List;

public class Contribuinte {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private Double rendaAnual;

	private List<Patrimonio> patrimonios = new ArrayList<>();

	public Contribuinte(String nome, String sobrenome, String cpf, String email, Double rendaAnual) {
		this.nome =  nome;
		this.sobrenome = sobrenome;
		this.cpf  =  cpf;
		this.email =  email;
		this.rendaAnual = rendaAnual;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}


	  
	  public void cadastrarpatrimonio(Patrimonio p) {
	    this.patrimonios.add(p);
	  }
	  
	  public List<Patrimonio> getPatrimonios() {
	    return this.patrimonios;
	  }
	  
	  public void setPatrimonios(List<Patrimonio> patrimonios) {
	    this.patrimonios = patrimonios;
	  }



	  public Double valorTotalDeclarado() {
	    Double totalValorDeclarado = this.rendaAnual;
	    for (Patrimonio patrimonio : this.patrimonios)
	      totalValorDeclarado = Double.valueOf(totalValorDeclarado.doubleValue() + patrimonio.getValor().doubleValue()); 
	    return totalValorDeclarado;
	  }

}
