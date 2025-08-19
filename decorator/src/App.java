public class App {
    public static void main(String[] args) throws Exception {

        Bebida pedido = new Cafe();
        System.out.println(pedido.getDescricao() + " R$ " + pedido.getPreco());

        pedido = new Leite(pedido);
        pedido = new Chantilly(pedido);
        pedido = new Adocante(pedido);
        System.out.println(pedido.getDescricao() + " R$ " + pedido.getPreco());
    }
}
