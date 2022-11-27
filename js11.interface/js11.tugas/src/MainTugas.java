public class MainTugas {
    public static void main(String[] args) {
        Singa sg = new Singa("CingaCing", 4, "Roarr Roarrr", "Cokelat");
        Kedelai kd = new Kedelai("Kedelai", 4, "Hehehehe", "Abu - Abu");
        Gorilla gr = new Gorilla("Gulali", 4, "Haumm Haummm", "Hitam Manis");

        kd.displayMakan();
        kd.displayBinatang();
        kd.displayData();

        System.out.println();
        gr.displayMakan();
        gr.displayBinatang();
        gr.displayData();

        System.out.println();
        sg.displayMakan();
        sg.displayBinatang();
        sg.displayData();
    }
}
