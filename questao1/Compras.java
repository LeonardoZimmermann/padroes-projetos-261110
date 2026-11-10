package questao1;

public class Compras implements ObservadorEstoque {
    private static final int estoque = 5;
    
    @Override
    public void atualizar(String produto, int anterior, int atual) {
        if (atual < estoque)
            System.out.printf("Compras %s: estoque baixo (%d unidades).%n\n", produto, atual);
    }
}