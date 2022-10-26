public class MainProgram {
    public static void main(String[] args) {
        Customer c1 = new Customer("Johnny", "Jalan Bunga Merak");
        Item i1 = new Item("Photobook ", 10, 300000);

        Order o = new Order(1);
        System.out.println();
        o.addOrder(c1, i1);
        System.out.println();
        o.printOrder();
        System.out.println();
        o.informastiStok();
    }
}
