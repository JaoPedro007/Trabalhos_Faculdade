package br.edu.utfpr.td.tsi.veiculo;

public class Veiculo {

    private String ano;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private double preco;

    public Veiculo(String ano, String marca, String modelo, String cor, String placa, double preco) {
        this.ano = ano;
        this.marca = marca;
        this.modelo= modelo;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
    }


    public String getAno() {
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
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String toString() {
        return "Ano: " + getAno() +
                "\nMarca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nCor: " + getCor() +
                "\nPlaca: " + getPlaca() +
                "\nPreço: " + getPreco();
    }

}
