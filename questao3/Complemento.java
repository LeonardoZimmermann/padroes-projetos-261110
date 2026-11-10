package questao3;

import java.math.*;

public abstract class Complemento implements Bebida {
    private final Bebida bebida;
    private final String nome;
    private final BigDecimal preco;
    protected Complemento(Bebida bebida, String nome, BigDecimal preco) {
        if (bebida == null) throw new IllegalArgumentException("Bebida obrigatória.");
        this.bebida = bebida;
        this.nome = nome;
        this.preco = preco;
    }
    public String getDescricao() { return bebida.getDescricao() + " + " + nome; }
    public BigDecimal getPreco() { return bebida.getPreco().add(preco); }
}