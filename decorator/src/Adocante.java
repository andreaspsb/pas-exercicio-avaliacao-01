public class Adocante extends AdicionalDecorator {
    private Bebida bebida;

    public Adocante(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Adoçante";
    }

    @Override
    public double preco() {
        return bebida.preco() + 0.5;
    }
}
