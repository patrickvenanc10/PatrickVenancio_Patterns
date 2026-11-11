public class Computador {
    private final String processador;
    private final String memoriaRam;
    private final String armazenamento;
    private final String placaDeVideo;        // opcional
    private final String sistemaOperacional;  // opcional

    // Construtor acessível apenas pelo builder (mesmo pacote)
    Computador(ComputadorBuilder builder) {
        this.processador = builder.getProcessador();
        this.memoriaRam = builder.getMemoriaRam();
        this.armazenamento = builder.getArmazenamento();
        this.placaDeVideo = builder.getPlacaDeVideo();
        this.sistemaOperacional = builder.getSistemaOperacional();
    }

    public String getProcessador() { return processador; }
    public String getMemoriaRam() { return memoriaRam; }
    public String getArmazenamento() { return armazenamento; }
    public String getPlacaDeVideo() { return placaDeVideo; }
    public String getSistemaOperacional() { return sistemaOperacional; }

    private static String valorOuNA(String valor) {
        return valor == null ? "N/A" : valor;
    }

    public void exibir() {
        System.out.println("Processador: " + valorOuNA(processador));
        System.out.println("RAM: " + valorOuNA(memoriaRam));
        System.out.println("Armazenamento: " + valorOuNA(armazenamento));
        System.out.println("Placa de vídeo: " + valorOuNA(placaDeVideo));
        System.out.println("Sistema operacional: " + valorOuNA(sistemaOperacional));
    }
}
