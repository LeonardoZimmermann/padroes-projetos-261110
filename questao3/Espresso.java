package questao3;

import java.math.*;

public class Espresso implements Bebida {
    private static final BigDecimal preco = new BigDecimal("6.00");
    public String getDescricao() { return "Espresso"; }
    public BigDecimal getPreco() { return preco; }
}