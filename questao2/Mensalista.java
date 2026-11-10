package questao2;

import java.math.*;

class Mensalista implements PerfilCobranca {
    public BigDecimal calcular(int minutos) { return Tarifas.vfixo_mensalista; }
}