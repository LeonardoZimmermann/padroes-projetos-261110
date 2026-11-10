package questao2;

public class Client {
    public static void main(String[] args) {
        Tiquete tiquete = new Tiquete("ACJ3265", 100, new Rotativo());
        System.out.printf("Mesmo tiquete: %s, %d minutos.%n", tiquete.getPlaca(), tiquete.getMinutos());
        System.out.println("Rotativo: R$ " + tiquete.calcularValor());
        tiquete.alterarPerfil(new Mensalista());
        System.out.println("Mensalista: R$" + tiquete.calcularValor());
        tiquete.alterarPerfil(new Conveniado());
        System.out.println("Conveniado: R$ " + tiquete.calcularValor());
    }
}
