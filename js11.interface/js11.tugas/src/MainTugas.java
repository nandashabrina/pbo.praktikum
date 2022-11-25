public class MainTugas {
    public static void main(String[] args) {
        Singa sg = new Singa("Singa Afrika", 4, "roarrr", "oranye");
        Kedelai kd = new Kedelai("Kedelai Arab", 4, "zeezh", "nude");
        Gorilla gr = new Gorilla("Gorilla", 2, "aummm", "hitam");
        
        sg.displayMakan();
        sg.displayBinatang();
        sg.displayData();

        System.out.println();
        kd.displayMakan();
        kd.displayBinatang();
        kd.displayData();

        System.out.println();
        gr.displayMakan();
        gr.displayBinatang();
        gr.displayData();
    }
}
