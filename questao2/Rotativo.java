package questao2;

import java.math.*;

public class Rotativo implements PerfilCobranca {
    public BigDecimal calcular(int minutos) {
        return Tarifas.vhora.multiply(BigDecimal.valueOf(Tarifas.horasIniciadas(minutos)));
    }
}