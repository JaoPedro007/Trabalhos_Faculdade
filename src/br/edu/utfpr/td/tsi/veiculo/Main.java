package br.edu.utfpr.td.tsi.veiculo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.utfpr.td.tsi.veiculo.lista.Lista;
import br.edu.utfpr.td.tsi.veiculo.lista.ListaEstatica;


public class Main {
    public static void main(String[] args) throws IOException {
        boolean encerrar = false;
        List<Veiculo> carros = LeitorArquivo.lerArquivo();
        ListaEstatica veiculos = new ListaEstatica();
        System.out.println(carros);

        while(encerrar==false) {
            int operacao = Integer.parseInt(
                    JOptionPane.showInputDialog("Qual operação deseja realizar? (1=Procurar | 2=Análise dos carros | 3=Encerrar)"));
            if(operacao==1) {
                String placa = JOptionPane.showInputDialog("Digite a placa do carro");
                Veiculo result = veiculos.procurar(carros, placa);
                JOptionPane.showMessageDialog(null, result);
            }
            else if(operacao==2) {
                Veiculo result = veiculos.analisarPreco(carros);
                JOptionPane.showMessageDialog(null, result);
            }
            else if(operacao==3) {
                encerrar=true;
            }
        }

    }


}
