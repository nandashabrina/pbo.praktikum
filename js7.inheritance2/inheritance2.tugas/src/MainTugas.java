public class MainTugas {
    public static void main(String[] args) {
        Mac m = new Mac("Macbook Air", 8, 256, 
        "Chip M1", "Lithium - Polymer", "Chip Appple M1");
        m.tampilMac();

        System.out.println();

        Windows w = new Windows("Asus Vivobook 14", 8, 256, 
        "AMD RYZEN 5", "Lithium IONS", "Transfer phone photos via Link  to MyASUS");
        w.tampilWindows();

        System.out.println();

        PC pc = new PC("HP All-in-One Desktop PC 24-df1042d", 8, 512, 
        "11th Generation Intel Core i5 Processor", 23);
        pc.tampilData();
    }
}
