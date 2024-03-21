package app;


public class App {
    static double totalPrice = 0;

    static int count = 1;

    public static void main(String[] args) {
        makeOrders();
    }

    private static void makeOrders() {
        int numOrder = 1;
        System.out.println("\n*** Order № " + numOrder + " ***");

        Order order1 = new Order.Builder().withBrand(Brand.ACTIVE_SPORTS)
                .withTshortColor(TshortColor.RED)
                .withPrice(Price.T_SHORT_PRICE).build();
        System.out.println(count + ") " + order1.toString());
        count++;
        totalPrice = order1.price().getPrice();


        order1 = new Order.Builder().withBrand(Brand.SMART_CAPS)
                .withCapColor(CapColor.WHITE)
                .withPrice(Price.CAP_WHITE_PRICE).build();
        totalPrice += order1.price().getPrice();
        System.out.println(count + ") " + order1);

        System.out.printf("To be paid: %.2f %s\n",totalPrice,Constants.CURRENCY);


        numOrder++;
        count = 1;
        System.out.println("\n*** Order № " + numOrder + " ***");

        Order order2 = new Order.Builder().withBrand(Brand.ACTIVE_SPORTS)
                .withTshortColor(TshortColor.BLUE)
                .withPrice(Price.T_SHORT_PRICE).build();
        System.out.println(count + ") " + order2.toString());
        count++;
        totalPrice = order2.price().getPrice();


        order2 = new Order.Builder().withBrand(Brand.SMART_CAPS)
                .withCapColor(CapColor.BLACK)
                .withPrice(Price.CAP_BLACK_PRICE).build();
        totalPrice += order2.price().getPrice();
        System.out.println(count + ") " + order2);

        System.out.printf("To be paid: %.2f %s",totalPrice,Constants.CURRENCY);

    }
}
