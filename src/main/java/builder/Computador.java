package builder;

public class Computador {

    private String processador;
    private int memoria;
    private int armazenamento;
    private String placaDeVideo;

    void setProcessador(String processador) {
        this.processador = processador;
    }

    void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    void setPlacaDeVideo(String placaDeVideo) {
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
