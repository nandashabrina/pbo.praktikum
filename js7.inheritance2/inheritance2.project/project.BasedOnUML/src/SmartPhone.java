public class SmartPhone extends Telepon{
    public String ipAddress;

    public SmartPhone(String owner, String noTelp, String ipAddress){
        super(owner, noTelp);
        this.ipAddress = ipAddress;
    }

    public void connectNetwork(String nama, String ipA){
        if(ipA.equals(this.ipAddress)){
            System.out.println("Telepon " + nama + " berhasil terhubung ke internet");
        }else{
            System.out.println("Telepon " + nama + " gagal terhubung ke internet");
        }
    }
}
