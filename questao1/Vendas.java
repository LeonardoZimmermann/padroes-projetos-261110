 //Vendas (exibe alerta quando o produto voltar a ter estoque após ter zerado) 
 package questao1;

 public class Vendas implements ObservadorEstoque {
     @Override
     public void atualizar(String produto, int anterior, int atual) {
    	 if (anterior == 0 && atual > 0) {
	            System.out.printf("Vendas %s voltou ao estoque: %d unidades.%n\n", produto, atual);
	    }
     }
 }