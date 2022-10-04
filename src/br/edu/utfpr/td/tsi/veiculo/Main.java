package br.edu.utfpr.td.tsi.veiculo;

import java.io.IOException;

import javax.swing.JOptionPane;

import br.edu.utfpr.td.tsi.veiculo.lista.ListaEstatica;


public class Main {
    public static void main(String[] args) throws IOException {
        boolean encerrar = false;

        ListaEstatica veiculos = new ListaEstatica();
        LeitorArquivo.lerArquivo(veiculos);
        Concessionaria concessionaria = new Concessionaria();

        while(encerrar==false) {
            int operacao = Integer.parseInt(
                    JOptionPane.showInputDialog("Qual operação deseja realizar? (1=Procurar | 2=Análise dos carros | 3=Encerrar)"));
            if(operacao==1) {
                String procurarPlaca = JOptionPane.showInputDialog("Digite a placa do carro");
                concessionaria.procurar(procurarPlaca);
            }
            else if(operacao==2) {

            }
            else if(operacao==3) {
                encerrar=true;
            }
        }

    }


}
