import java.math.BigDecimal;

public abstract class Veiculo {

    private BigDecimal quilometragem;
    private TanqueCombustivel tanque;
    private Freios freios = new Freios(new BigDecimal("1000"));

    public abstract void andar(BigDecimal distancia, BigDecimal velocidade);

    public void abastecer(BigDecimal quantidade, Combustivel combustivel){
        tanque.receber(combustivel, quantidade);

    }
    public void arrumarFreios(){
        freios.arrumar();

    }
}
