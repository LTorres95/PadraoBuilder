package builder;

public interface ComputadorBuilder {

    void reiniciar();

    void construirProcessador();

    void construirMemoria();

    void construirArmazenamento();

    void construirPlacaDeVideo();

    Computador getComputador();
}
