package br.edu.utfpr.td.tsi.veiculo;

import br.edu.utfpr.td.tsi.veiculo.lista.ListaEstatica;

public class Concessionaria {

    ListaEstatica listaEstatica = new ListaEstatica();


    public Veiculo analisar(Veiculo carros) {

        return this.listaEstatica.analisar(carros);
    }

    public Veiculo procurar(String placa) {
        return this.listaEstatica.procurar(placa);
    }
}

