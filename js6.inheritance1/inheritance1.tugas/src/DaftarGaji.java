public class DaftarGaji {
    public Pegawai[] listPegawai;

    public DaftarGaji(int jumlah){
        this.listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai pegawai){
        for(int i=0 ; i<listPegawai.length ; i++){
            if(listPegawai[i] == null){
                this.listPegawai[i] = pegawai;
                break;
            }
        }
        System.out.println("Data pegawai " + pegawai.getNama() + " berhasil ditambahkan");
    }

    public void printSemuaGaji(){
        System.out.println("===== Informasi Gaji Pegawai =====");
        for(int i=0 ; i<listPegawai.length ; i++){
            System.out.println("Nama pegawai   : " + listPegawai[i].getNama());
            System.out.println("NIP pegawai    : " + listPegawai[i].nip);
            System.out.println("Alamat pegawai : " + listPegawai[i].getAlamat());
            System.out.println("Gaji pegawai   : " + listPegawai[i].getGaji());
            System.out.println();
        }
    }
}
