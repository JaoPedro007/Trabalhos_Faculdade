import java.math.BigDecimal;

public class Freios {

    private BigDecimal vidaUtilTotal;
    private BigDecimal vidaUtilRestante;

    public Freios(BigDecimal vidaUtilTotal) {
        this.vidaUtilTotal = vidaUtilTotal;
    }

    public void arrumar(){
        this.vidaUtilRestante = this.vidaUtilTotal;
        System.out.println("Freios arrumados");

    }
}
