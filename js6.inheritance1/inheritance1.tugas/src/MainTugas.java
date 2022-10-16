public class MainTugas {
    public static void main(String[] args) {
        DaftarGaji dg = new DaftarGaji(3);
        
        Dosen p1 = new Dosen("022P1", "Jeffrey Jung", "Cornelia Street");       
        Dosen p2 = new Dosen("011P2", "Johnny Suh", "Taylor Street");        
        Dosen p3 = new Dosen("444P3", "Mark Lee", "Romeo Street");
        
        p1.jumlahSKS = 2;
        p2.jumlahSKS = 3;
        p3.jumlahSKS = 2;      
        
        dg.addPegawai(p1);
        dg.addPegawai(p2);
        dg.addPegawai(p3);
        
        System.out.println();
        dg.printSemuaGaji();
    }
}
