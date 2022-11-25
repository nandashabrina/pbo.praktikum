public class InterfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakRektor.bersertifikatMawapres(masterCumlaude);
        pakRektor.bersertifikatMawapres(sarjanaCumlaude);
    }
}
