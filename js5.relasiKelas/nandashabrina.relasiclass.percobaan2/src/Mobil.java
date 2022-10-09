// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB-2E
// NIM  : 2141762064
// Absen: 14

public class Mobil{
    private String merk;
    private int biaya;

    public Mobil(){
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setBiaya(int biaya){
        this.biaya = biaya;
    }

    public int getBiaya(){
        return biaya;
    }

    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}