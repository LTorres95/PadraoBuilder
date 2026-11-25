package builder;

public class ComputadorEscritorioBuilder implements ComputadorBuilder {

    private Computador computador;

    public ComputadorEscritorioBuilder() {
        reiniciar();
    }

    @Override
    public void reiniciar() {
        computador = new Computador();
    }

    @Override
    public void construirProcessador() {
        computador.setProcessador("Intel Core i3");
    }

    @Override
    public void construirMemoria() {
        computador.setMemoria(8);
    }

    @Override
    public void construirArmazenamento() {
        computador.setArmazenamento(256);
    }

    @Override
    public void construirPlacaDeVideo() {
        computador.setPlacaDeVideo("Integrada");
    }

    @Override
    public Computador getComputador() {
        return computador;
    }
}
