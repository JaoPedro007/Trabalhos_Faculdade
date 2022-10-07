import java.math.BigDecimal;

public class CarroEsportivo extends Veiculo{

    @Override
    public void andar(BigDecimal distancia, BigDecimal velocidade) {
        System.out.println("Carro Esportivo está andando");
    }
}
