package questao1;

public class Client {
    public static void main(String[] args) {
        Estoque produto = new Estoque("Cafe", 10);
        Compras compras = new Compras();
        produto.incluirObserver(compras);
        produto.incluirObserver(new Vendas());
        produto.incluirObserver(new Auditoria());
        produto.alterarQuantidade(4);
        produto.alterarQuantidade(0);
        produto.alterarQuantidade(8);
        produto.alterarQuantidade(8);
        produto.removerObserver(compras);
        produto.alterarQuantidade(2);
        produto.alterarQuantidade(0);
        produto.alterarQuantidade(6);
    }
}