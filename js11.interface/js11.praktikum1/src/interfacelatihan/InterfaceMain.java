public class InterfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // sarjanaCumlaude.kuliahDiKampus();
        pakRektor.bersertifikatMawapres(masterCumlaude);
        pakRektor.bersertifikatMawapres(sarjanaCumlaude);
    }
}
