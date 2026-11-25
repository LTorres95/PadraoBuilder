package builder;

public class MontadorComputador {

    private ComputadorBuilder builder;

    public MontadorComputador(ComputadorBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ComputadorBuilder builder) {
        this.builder = builder;
    }

    public Computador montar() {
        builder.reiniciar();
        builder.construirProcessador();
        builder.construirMemoria();
        builder.construirArmazenamento();
        builder.construirPlacaDeVideo();
        return builder.getComputador();
    }
}
