package questao3;

import java.math.*;

public class Leite extends Complemento {
    private static final BigDecimal preco = new BigDecimal("2.00");
    Leite(Bebida bebida) { super(bebida, "Leite", preco); }
}