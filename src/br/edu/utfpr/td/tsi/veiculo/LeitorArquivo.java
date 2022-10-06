package br.edu.utfpr.td.tsi.veiculo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import javax.swing.*;

public class LeitorArquivo {



    public static List<Veiculo> lerArquivo() {
        List<Veiculo> carros = new ArrayList<>();

        try {
            Reader in = new FileReader("carros.csv");
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);

            Veiculo veiculo;
            for (CSVRecord record : records){
                String ano = record.get(0);
                String marca = record.get(1);
                String modelo = record.get(2);
                String cor = record.get(3);
                String placa = record.get(4);
                String preco = record.get(5);
                veiculo = new Veiculo(ano, marca, modelo, cor, placa, preco);
                carros.add(veiculo);
            }

        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo CSV");
        }

        return carros;
    }

}
