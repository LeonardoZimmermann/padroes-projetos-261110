package questao3;

import java.math.*;

public class Chantilly extends Complemento {
    private static final BigDecimal preco = new BigDecimal("3.00");
    Chantilly(Bebida bebida) { super(bebida, "Chantilly", preco); }
}