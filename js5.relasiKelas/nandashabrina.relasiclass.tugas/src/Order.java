public class Order {
    public Customer[] lisCustomers;
    public Item[] lItems;

    public Order(int len){
        this.lItems = new Item[len];
        this.lisCustomers = new Customer[len];
    }

    public void addOrder(Customer cust, Item item){
        for(int i=0 ; i<lItems.length ; i++){
            for(int j=0 ; j<lisCustomers.length ; j++){
                if(lItems[i] == null && lisCustomers[j] == null){
                    this.lItems[i] = item;
                    this.lisCustomers[j] = cust;
                    this.lItems[i].stok -= 1;
                    break;
                }
            }
        }
        System.out.println("Pesanan atas nama " + cust.name + " dengan item " + item.merk + " berhasil ditambahkan");
    }

    public void printOrder(){
        System.out.println("====== DATA ORDER ITEM ======");
        for(int i=0 ; i<lItems.length ; i++){
            for(int j=0 ; j<lisCustomers.length ; j++){
                if(lItems[i] != null && lisCustomers[j] != null){
                System.out.println("Nama pelanggan       : " + lisCustomers[j].name);
                System.out.println("Item yang dibeli     : " + lItems[i].merk);
                System.out.println("Total bayar          : " + lItems[i].harga);
                System.out.println();
                break;
                }
            }
        }
    }

    public void informastiStok(){
        System.out.println("====== INFORMASI STOK PRODUK ======");
        for(int i=0 ; i<lItems.length ; i++){
            System.out.println("Merk item            : " + lItems[i].merk);
            System.out.println("Harga item           : " + lItems[i].harga);
            System.out.println("Stok yang tersedia   : " + lItems[i].stok);
            System.out.println();
        }
    }
}
