import javax.swing.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CarroEsportivo carroEsportivo = new CarroEsportivo();
        CarroSedan carroSedan = new CarroSedan();
        
        carroEsportivo.andar(new BigDecimal("10"), new BigDecimal("50"));
        carroSedan.andar(new BigDecimal("10"), new BigDecimal("50"));

    }
}