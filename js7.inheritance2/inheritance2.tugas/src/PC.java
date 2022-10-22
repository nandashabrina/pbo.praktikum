public class PC extends Komputer{
    public int ukuranMonitor;

    public PC(){
    }

    public PC(String merk, int kecProcessor, int sizeMemory, 
            String jnsProsesor, int ukuranMonitor){
                super(merk, ukuranMonitor, sizeMemory, jnsProsesor);
                this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPC(){
        super.tampilData();
        System.out.println("Ukuran monitor      : " + ukuranMonitor);
    }
}
