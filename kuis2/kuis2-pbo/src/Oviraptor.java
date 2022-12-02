public class Oviraptor extends Dinosaurus implements IBertelur{
    @Override
    public void makan(){
        System.out.println("Oviraptor memiliki makanan utama crustacea dan mollusca");
    }

    @Override 
    public void berjalan(){
        System.out.println("Oviraptor berjalan dengan kaki");
    }

    @Override
    public void bertelur(){
        System.out.println("Oviraptor merupakan hewan yang berkembang biak dengan cara bertelur");
    }
}
