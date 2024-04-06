package app.builder;

public class MainBuilder {

    public static void main(String[] args) {

        Product redTShirt = new TShirt("Red T-Shirt", "Red", "Active sports", 15.99);
        Product whiteCap = new Cap("White Cap", "White", "Smart caps", 9.99);
        Product blueTShirt = new TShirt("Blue T-Shirt", "Blue", "Active sports", 17.99);
        Product blackCap = new Cap("Black Cap", "Black", "Smart caps", 11.99);

        Order orderA = new OrderA(redTShirt, whiteCap);
        Order orderB = new OrderB(blueTShirt, blackCap);

        displayOrderDetails(orderA);
        displayOrderDetails(orderB);

    }

    public static void displayOrderDetails(Order order) {
        System.out.println("Order Details:");
        System.out.println("T-Shirt: " + order.getTShirt().name()
                + ", Color: " + order.getTShirt().color()
                + ", Manufacturer: " + order.getTShirt().manufacturer()
                + ", Price: " + order.getTShirt().price());
        System.out.println("Cap: " + order.getCap().name()
                + ", Color: " + order.getCap().color()
                + ", Manufacturer: " + order.getCap().manufacturer()
                + ", Price: " + order.getCap().price());
        System.out.printf("Total Cost: %.2f%n",(order.getTShirt().price()
                + order.getCap().price()));
    }
}

