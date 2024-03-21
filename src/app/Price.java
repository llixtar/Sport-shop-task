package app;

public enum Price {

    CAP_WHITE_PRICE(499.99f),
    CAP_BLACK_PRICE(449.99f),
    T_SHORT_PRICE(799.99f);

    private final float price;

    Price(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
