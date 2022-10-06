package br.edu.utfpr.td.tsi.veiculo.lista;

import br.edu.utfpr.td.tsi.veiculo.Veiculo;

import java.util.List;

public interface Lista {
    public Veiculo procurar(List<Veiculo> carros, String placa);
    public Veiculo analisar(Veiculo carros);


}
