package questao2;

import java.math.*;

public class Conveniado implements PerfilCobranca {
	
	@Override
    public BigDecimal calcular(int minutos) {
        int cobrados = Math.max(0, minutos - Tarifas.tempo_gratis);
        return Tarifas.vhora
        	.multiply(BigDecimal.valueOf(Tarifas.horasIniciadas(cobrados)))
            .multiply(BigDecimal.ONE.subtract(Tarifas.desc_conveniado));
    }
}