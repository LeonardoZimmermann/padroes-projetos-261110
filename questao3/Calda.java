package questao3;

import java.math.BigDecimal;

class Calda extends Complemento {
    private static final BigDecimal preco = new BigDecimal("1.50");
    Calda(Bebida bebida) { super(bebida, "Calda", preco); }
}