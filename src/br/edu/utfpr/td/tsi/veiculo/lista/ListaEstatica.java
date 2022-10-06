package br.edu.utfpr.td.tsi.veiculo.lista;

import br.edu.utfpr.td.tsi.veiculo.Veiculo;

import javax.swing.*;
import java.util.ArrayList;

public class ListaEstatica implements Lista {


    ArrayList<Veiculo> veiculos = new ArrayList<>();

    @Override
    public Veiculo procurar(String placa) {
        Veiculo veiculoProcurado = null;
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos != null) {
                if (veiculos.contains(placa)) {
                    veiculoProcurado = veiculos.get(i);
                }
            }
        }
        System.out.println(veiculoProcurado);
        return veiculoProcurado;
    }

    @Override
    public Veiculo analisar(Veiculo carros) {
        return null;
    }

}
