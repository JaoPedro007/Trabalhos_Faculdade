package br.edu.utfpr.td.tsi.veiculo;

public class Veiculo {

    private String ano;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String preco;


    public String getAno(String ano) {
        return this.ano = ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }

}
