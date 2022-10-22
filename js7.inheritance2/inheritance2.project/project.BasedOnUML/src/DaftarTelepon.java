public class DaftarTelepon {
    public Telepon[] listTelepon;

    public DaftarTelepon(int jml){
        this.listTelepon = new Telepon[jml];
    }
    
    public void addTelepon(Telepon telepon){
        for(int i=0 ; i<listTelepon.length ; i++){
            if(listTelepon[i] == null){
                this.listTelepon[i] = telepon;
                break;
            }
        }
        System.out.println("Data telepon milik " + telepon.owner + " berhasil ditambahkan");
    }

    public void calling(String name, String sName){
        for(int i=0 ; i<listTelepon.length ; i++){
            if(name.equals(listTelepon[i].owner)){
                System.out.println(sName + " sedang menelepon " + name);
                break;
            }else{
                System.out.println("Nomor tidak tersedia");
            }
        }
    }

    public void printData(){
        System.out.println("======= DATA NOMOR TELEPON =======");
        for(int i=0 ; i<listTelepon.length ; i++){
           System.out.println("Nama          : " + listTelepon[i].owner);
           System.out.println("Nomor telepon : " + listTelepon[i].noTelp);
           System.out.println();
        }
    }
}
