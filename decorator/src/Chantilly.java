public class Chantilly extends AdicionalDecorator {
    private Bebida bebida;

    public Chantilly(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chantilly";
    }

    @Override
    public double preco() {
        return bebida.preco() + 1.5;
    }
}
