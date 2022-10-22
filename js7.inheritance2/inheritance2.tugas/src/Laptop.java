public class Laptop extends Komputer{
    public String jnsBaterai;

    public Laptop(){
    }

    public Laptop(String merk, int kecProcessor, int sizeMemory, String jnsProsesor, String jnsBaterai){
        super(merk, kecProcessor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai       : " + jnsBaterai);
    }
}
