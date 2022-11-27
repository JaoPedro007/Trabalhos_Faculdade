import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[]args) {

	    LeitorArquivo leitorArquivo = new LeitorArquivo();
	    Set<Contribuinte> contribuintes = leitorArquivo.lerArquivoContribuinte();
	    List<Contribuinte> listaContribuintes = new ArrayList<>(contribuintes);
	    LeitorArquivo LeitorArquivo = new LeitorArquivo();
	    List<Patrimonio> patrimonios = LeitorArquivo.lerArquivoPatrimonio();
	    for (Patrimonio patrimonio : patrimonios) {
	      for (Contribuinte contribuinte : contribuintes) {
	        if (contribuinte.getCpf().equals(patrimonio.getCpf()))
	          contribuinte.cadastrarpatrimonio(patrimonio); 
	      } 
	    } 
	    System.out.println("========================================");
	    System.out.println("Contribuintes com menor valor declarado:");
	    Collections.sort(listaContribuintes);
	    List<Contribuinte> os10MaisMenosRicos = listaContribuintes.subList(0, 10);
	    for (Contribuinte contribuinte : os10MaisMenosRicos) {
	      System.out.println(String.format("Nome: %s CPF: %s Total declarado: %s", new Object[] { contribuinte.getNome(), contribuinte.getCpf(), contribuinte.valorTotalDeclarado() }));
	    } 
	    System.out.println("========================================");
	    System.out.println("Contribuintes com maior valor declarado:");
	    Collections.sort(listaContribuintes, Collections.reverseOrder());
	    List<Contribuinte> os10MaisRicos = listaContribuintes.subList(0, 10);
	    for (Contribuinte contribuinte : os10MaisRicos) {
	      System.out.println(String.format("Nome: %s CPF: %s Total declarado: %s", new Object[] { contribuinte.getNome(), contribuinte.getCpf(), contribuinte.valorTotalDeclarado() }));
	    } 
	    System.out.println("========================================");
	    System.out.println("Patrimonios de maior valor:");
	    Collections.sort(patrimonios, Collections.reverseOrder());
	    List<Patrimonio> patrimoniosMaiorValor = patrimonios.subList(0, 3);
	    for (Patrimonio patrimonio : patrimoniosMaiorValor) {
	      System.out.println(String.format("Descricao: %s, Valor R$ %s, Contribuinte: %s", new Object[] { patrimonio.getDescricao(), patrimonio.getValor(), patrimonio.getCpf() }));
	    }
		
	}
}
