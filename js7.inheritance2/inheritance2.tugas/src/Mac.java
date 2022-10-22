public class Mac extends Laptop{
    public String security;

    public Mac(){
    }

    public Mac(String merk,  int kecProcessor, int sizeMemory, 
            String jnsProsesor, String jnsBaterai, String security){
                super(merk, kecProcessor, sizeMemory, jnsProsesor, jnsBaterai);
                this.security = security;
    }

    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security            : " +security);
    }
}
