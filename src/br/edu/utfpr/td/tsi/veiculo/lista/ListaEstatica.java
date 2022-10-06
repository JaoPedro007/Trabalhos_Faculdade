package br.edu.utfpr.td.tsi.veiculo.lista;

import br.edu.utfpr.td.tsi.veiculo.Veiculo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaEstatica implements Lista {

    @Override
    public Veiculo procurar(List<Veiculo> carros, String placa) {
        for (int i = 0; i< carros.size(); i++) {
            if(Objects.equals(carros.get(i).getPlaca(), placa)) {
                return carros.get(i);
            }
        }
        return null;
    }

    @Override
    public Veiculo analisar(Veiculo carros) {
        return null;
    }

    public Veiculo analisarPreco(List<Veiculo> carros) {
        Veiculo posicaoCarro = null;
        double maiorPreco = 0;
        for (Veiculo carro : carros ) {
            if(carro.getPreco() >= maiorPreco) {
                maiorPreco = carro.getPreco();
                posicaoCarro = carro;
            }
        }
        return posicaoCarro;
    }

}
