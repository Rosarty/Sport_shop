package app.builder;

public class OrderB implements Order {
    private final Product tShirt;
    private final Product cap;

    public OrderB(Product tShirt, Product cap) {
        this.tShirt = tShirt;
        this.cap = cap;
    }

    @Override
    public Product getTShirt() {
        return tShirt;
    }

    @Override
    public Product getCap() {
        return cap;
    }
}


