import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class LeitorArquivo {
	public List<Patrimonio> lerArquivoPatrimonio() {
		try {
			List<Patrimonio> patrimonios = new ArrayList<>();
			Reader leitorArquivo = new FileReader("patrimonios.csv");
			CSVFormat configCSV = CSVFormat.Builder.create().setHeader(new String[] { "cpf", "descricao", "valor" })
					.setSkipHeaderRecord(true).build();
			CSVParser conversorArquivo = configCSV.parse(leitorArquivo);
			List<CSVRecord> records = conversorArquivo.getRecords();
			for (CSVRecord record : records) {
				String cpf = record.get("cpf");
				String descricao = record.get("descricao");
				Double valor = Double.valueOf(record.get("valor"));
				Patrimonio p = new Patrimonio(cpf, descricao, valor);
				patrimonios.add(p);
			}
			System.out.println(String.format("Registros de Patrimonio Processados: %s",
					new Object[] { Integer.valueOf(patrimonios.size()) }));
			return patrimonios;
		} catch (IOException e) {
			System.out.println("Erro ao abrir arquivo CSV");
		}
		return null;
	}
	public Set<Contribuinte> lerArquivoContribuinte() {
	    try {
	      int registrosProcessados = 0;
	      Set<Contribuinte> contribuintes = new HashSet<>();
	      Reader leitorArquivo = new FileReader("contribuintes.csv");
	      CSVFormat configCSV = CSVFormat.Builder.create()
	        .setHeader(new String[] { "cpf", "nome", "sobrenome", "email", "rendaAnual" }).setSkipHeaderRecord(true).build();
	      CSVParser interpretadorCSV = configCSV.parse(leitorArquivo);
	      List<CSVRecord> records = interpretadorCSV.getRecords();
	      for (CSVRecord record : records) {
	        String cpf = record.get("cpf");
	        String nome = record.get("nome");
	        String sobrenome = record.get("sobrenome");
	        String email = record.get("email");
	        Double renda = Double.valueOf(record.get("rendaAnual"));
	        Contribuinte c = new Contribuinte(nome, sobrenome, cpf, email, renda);
	        contribuintes.add(c);
	        registrosProcessados++;
	      } 
	      System.out.println(String.format("Registros de Contribuinte Processados: %s Contribuintes: %s", new Object[] { Integer.valueOf(registrosProcessados), Integer.valueOf(contribuintes.size()) }));
	      return contribuintes;
	    } catch (IOException e) {
	      System.out.println("Erro ao abrir arquivo CSV");
	      return null;
	    } 
	  }
}
