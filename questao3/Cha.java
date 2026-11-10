package questao3;

import java.math.*;

public class Cha implements Bebida {
    private static final BigDecimal preco = new BigDecimal("4.00");
    public String getDescricao() { return "Chá"; }
    public BigDecimal getPreco() { return preco; }
}