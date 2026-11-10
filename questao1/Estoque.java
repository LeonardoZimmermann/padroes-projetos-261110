package questao1;

import java.util.*;

public class Estoque {
    private final String nome;
    private int quantidade;
    private final Set<ObservadorEstoque> observers = new LinkedHashSet<>();

    Estoque(String nome, int quantidade) {
        if (nome == null || nome.trim().isEmpty() || quantidade < 0)
            throw new IllegalArgumentException("Nome obrigatorio e estoque nao negativo");
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public void incluirObserver(ObservadorEstoque obs) {
        if (obs == null) throw new IllegalArgumentException("Área obrigatoria");
        observers.add(obs);
    }
    public void removerObserver(ObservadorEstoque area) { observers.remove(area); }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) throw new IllegalArgumentException("Estoque não pode ser negativo");
        if (quantidade == novaQuantidade) return;
        int anterior = quantidade;
        quantidade = novaQuantidade;
        for (ObservadorEstoque area : new LinkedHashSet<>(observers))
            area.atualizar(nome, anterior, novaQuantidade);
    }
}