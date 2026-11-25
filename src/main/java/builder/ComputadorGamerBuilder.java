package builder;

public class ComputadorGamerBuilder implements ComputadorBuilder {

    private Computador computador;

    public ComputadorGamerBuilder() {
        reiniciar();
    }

    @Override
    public void reiniciar() {
        computador = new Computador();
    }

    @Override
    public void construirProcessador() {
        computador.setProcessador("AMD Ryzen 7");
    }

    @Override
    public void construirMemoria() {
        computador.setMemoria(32);
    }

    @Override
    public void construirArmazenamento() {
        computador.setArmazenamento(1000);
    }

    @Override
    public void construirPlacaDeVideo() {
        computador.setPlacaDeVideo("NVIDIA RTX 4070");
    }

    @Override
    public Computador getComputador() {
        return computador;
    }
}
