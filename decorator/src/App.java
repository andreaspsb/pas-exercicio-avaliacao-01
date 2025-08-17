public class App {
    public static void main(String[] args) throws Exception {
    // Exemplo de uso do padrão Decorator
    Bebida pedido = new Cafe();
    System.out.println(pedido.getDescricao() + " R$ " + pedido.preco());

    pedido = new Leite(pedido);
    pedido = new Chantilly(pedido);
    pedido = new Adocante(pedido);
    System.out.println(pedido.getDescricao() + " R$ " + pedido.preco());
    }
}
