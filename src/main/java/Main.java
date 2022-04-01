public class Main {

    public static void main(String[] args) {

        ShopService shop = new ShopService();
        System.out.println("Auflistung aller Produkte die über shopService.init hinzugefügt wurden:");
        shop.listProducts();
        System.out.println("Auflistung eines einzelnen Produkts - PR001");
        shop.printProduct("PR001");
        System.out.println();
        System.out.println("Hinzufügen von drei Bestellungen - PR001, PR001, PR002");
        shop.addOrder(shop.getProduct("PR001"));
        shop.addOrder(shop.getProduct("PR001"));
        shop.addOrder(shop.getProduct("PR002"));
        System.out.println("und Ausgabe der Gesamtbestellungen.");
        shop.listOrders();
        System.out.println("Erstelleung einer Bestellung über Scanner");
        shop.addOrder();
        System.out.println("Ausgabe der Bestellung über Scanner");
        shop.listOrders();





    }
}
