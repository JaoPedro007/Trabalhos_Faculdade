package br.edu.utfpr.td.tsi.veiculo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import br.edu.utfpr.td.tsi.veiculo.lista.ListaEstatica;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class LeitorArquivo {

    public static ListaEstatica lerArquivo() {
        ListaEstatica lista = new ListaEstatica();
        lerArquivo(lista);
        return lista;
    }

    public static void lerArquivo(ListaEstatica lista) {
        try {
            Reader in = new FileReader("carros.csv");
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
            for (CSVRecord record : records) {
                String ano = record.get(0);
                String marca = record.get(1);
                String modelo = record.get(2);
                String cor = record.get(3);
                String placa = record.get(4);
                String preco = record.get(5);
                System.out.println(String.format("%s %s %s %s %s %s", ano, marca, modelo, cor, placa, preco));
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo CSV");
        }
    }
}
