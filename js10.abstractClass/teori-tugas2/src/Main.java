public class Main {
    public static void main (String [] args){
        Canon canon = new Canon ();
        Samsung samsung =new Samsung ();
        canon.printing();
        samsung.fotocopy();
        samsung.printing();

        canon.scanner();
    }
}
