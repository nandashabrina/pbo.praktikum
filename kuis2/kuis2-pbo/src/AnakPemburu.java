public class AnakPemburu extends Pemburu implements IMengambilTelur{
    @Override 
    public void berburu(TyrannosaurusRex tRex) {
        super.berburu(tRex);
    }

    @Override
    public void mengambilTelur(Dinosaurus dino){
        if(dino instanceof TyrannosaurusRex){
            System.out.println("Anak pemburu mengambil telur TyrannosaurusRex");
        }else if(dino instanceof Triceratops){
            System.out.println("Anak pemburu mengambil telur Triceratops");
        }else if(dino instanceof Oviraptor){
            System.out.println("Anak pemburu mengambil telur Oviraptor");
        }
    }
}
