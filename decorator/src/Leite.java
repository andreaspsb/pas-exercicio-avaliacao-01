public class Leite extends AdicionalDecorator {
    private Bebida bebida;

    public Leite(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public double preco() {
        return bebida.preco() + 1.0;
    }
}
