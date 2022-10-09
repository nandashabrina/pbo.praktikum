// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB - 2E
// NIM  : 2141762064
// Absen: 14

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){
    }

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setProc(Processor proc){
        this.proc = proc;
    }

    public Processor getProc(){
        return proc;
    }

    public void info(){
        System.out.println("Merk Laptop  = " + merk);
        proc.info();
    }
}
