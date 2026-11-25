package builder;

public class Computador {

    private final String processador;
    private final int memoria;
    private final int armazenamento;
    private final String placaDeVideo;

    Computador(String processador, int memoria, int armazenamento, String placaDeVideo) {
        this.processador = processador;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String descrever() {
        return "Processador: " + processador
                + " | Memória: " + memoria + " GB"
                + " | Armazenamento: " + armazenamento + " GB"
                + " | Placa de vídeo: " + placaDeVideo;
    }
}
