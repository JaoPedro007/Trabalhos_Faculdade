package br.edu.utfpr.td.tsi.veiculo.lista;

import br.edu.utfpr.td.tsi.veiculo.Veiculo;

public interface Lista {
    public void inserirVeiculo(Veiculo veiculo);
    public Veiculo procurar(String placa);
    public Veiculo analisar(Veiculo carros);


}
