package questao2;

import java.math.*;

public class Tiquete {
    private final String placa;
    private final int minutos;
    private PerfilCobranca perfil;
    Tiquete(String placa, int minutos, PerfilCobranca perfil) {
        if (placa == null || placa.trim().isEmpty() || minutos < 0)
            throw new IllegalArgumentException("Placa obrigatória e tempo nao negativo");
        this.placa = placa;
        this.minutos = minutos;
        alterarPerfil(perfil);
    }
    public void alterarPerfil(PerfilCobranca perfil) {
        if (perfil == null) throw new IllegalArgumentException("Perfil obrigatorio");
        this.perfil = perfil;
    }
    public BigDecimal calcularValor() { return perfil.calcular(minutos).setScale(2, RoundingMode.HALF_UP); }
    public String getPlaca() { return placa; }
    public int getMinutos() { return minutos; }
}
