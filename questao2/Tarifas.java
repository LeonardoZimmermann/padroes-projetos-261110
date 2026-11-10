package questao2;

import java.math.*;

final class Tarifas {
    static final BigDecimal vhora = new BigDecimal("12.00");
    static final BigDecimal vfixo_mensalista = new BigDecimal("20.00");
    static final BigDecimal desc_conveniado = new BigDecimal("0.25"); // 25%
    static final int tempo_gratis = 30;
    private Tarifas() { }
    static long horasIniciadas(int minutos) { return (minutos + 59L) / 60; }
}