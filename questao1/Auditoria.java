package questao1;

class Auditoria implements ObservadorEstoque {
	@Override
    public void atualizar(String produto, int anterior, int atual) {
        System.out.printf("Auditoria %s: %d -> %d unidades.%n\n", produto, anterior, atual);
    }
}
