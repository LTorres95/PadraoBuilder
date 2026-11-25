package builder;

public class ComputadorBuilder {

    private String processador;
    private int memoria;
    private int armazenamento = 256;
    private String placaDeVideo = "Integrada";

    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder memoria(int memoria) {
        this.memoria = memoria;
        return this;
    }

    public ComputadorBuilder armazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder placaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public Computador build() {
        if (processador == null) {
            throw new IllegalStateException("Processador é obrigatório");
        }
        if (memoria <= 0) {
            throw new IllegalStateException("Memória é obrigatória");
        }
        return new Computador(processador, memoria, armazenamento, placaDeVideo);
    }
}
