public class Segitiga{
    private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB){
        double c = sisiA + sisiB;
        return c;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        
        int total1 = s.totalSudut(120);
        System.out.println("Total sudut segitiga 1 = " + total1);
        
        int total2 = s.totalSudut(90, 45);
        System.out.println("Total sudut segitiga 2 = " + total2);
        
        int kel1 = s.keliling(20, 28, 32);
        System.out.println("Keliling segitiga a    = " + kel1);
        
        double kel2 = s.keliling(32, 28);
        System.out.println("Keliling segitiga b    = " + kel2);
    }
}