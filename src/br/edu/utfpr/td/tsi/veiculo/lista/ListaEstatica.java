package br.edu.utfpr.td.tsi.veiculo.lista;

import br.edu.utfpr.td.tsi.veiculo.Veiculo;

public class ListaEstatica implements Lista {

    public Veiculo [] veiculos = new Veiculo[100];
    private int index=0;


    @Override
    public void inserirVeiculo(Veiculo veiculo) {
        this.veiculos[index] = veiculo;
        index++;
    }

    @Override
    public Veiculo procurar(String placa) {
        Veiculo veiculoProcurado = null;
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                if (veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                    veiculoProcurado = veiculos[i];
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
