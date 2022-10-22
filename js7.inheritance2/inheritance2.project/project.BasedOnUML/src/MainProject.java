public class MainProject {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("Kate", "08113115566");
        SmartPhone sp = new SmartPhone("William", "08115007766", "192.168.1.3.");

        DaftarTelepon dt = new DaftarTelepon(2);
        dt.addTelepon(mp);
        dt.addTelepon(sp);

        System.out.println();
        dt.calling("Kate","William");
        
        System.out.println();
        sp.connectNetwork("William", "109.177.2.4");
        sp.connectNetwork("William", "192.168.1.3.");

        System.out.println();
        dt.printData();
    }
}
