public class Adocante extends AdicionalDecorator {

    public Adocante(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Adoçante";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.5;
    }
}
