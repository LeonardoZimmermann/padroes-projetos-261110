package questao3;

public class Main {
    public static void main(String[] args) {
        Bebida[] pedidos = {
            new Leite(new Espresso()),
            new Calda(new Chantilly(new Cha())),
            new Calda(new Leite(new Leite(new Espresso())))
        };
        for (Bebida pedido : pedidos)
            System.out.println(pedido.getDescricao() + " — R$ " + pedido.getPreco());
    }
}
