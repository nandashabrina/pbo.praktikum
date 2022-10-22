public class Windows extends Laptop{
    public String fitur;

    public Windows(){
    }

    public Windows(String merk, int kecProcessor, int sizeMemory, String jnsProsesor,
        String jnsBaterai, String fitur){
            super(merk, kecProcessor, sizeMemory, jnsProsesor, jnsBaterai);
            this.fitur = fitur;
    }

    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur               : " + fitur);
    }
}


