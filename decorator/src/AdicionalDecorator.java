public abstract class AdicionalDecorator implements Bebida {
    protected Bebida bebida;

    protected AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}
