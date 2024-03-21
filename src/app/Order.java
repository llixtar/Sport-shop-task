package app;

public record Order(Brand brand, CapColor capColor, TshortColor tshortColor, Price price) {
    private Order(Builder builder) {
        this(builder.brand, builder.capColor, builder.tshortColor, builder.price);
    }


    public static class Builder {

        private Brand brand;
        private CapColor capColor;
        private TshortColor tshortColor;
        private Price price;


        public Builder withCapColor(CapColor capColor) {
            this.capColor = capColor;
            return this;
        }

        public Builder withBrand(Brand brand) {
            this.brand = brand;
            return this;
        }

        public Builder withTshortColor(TshortColor tshortColor) {
            this.tshortColor = tshortColor;
            return this;
        }

        public Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }

    public String toString() {

        StringBuilder sb = new StringBuilder();


        if (brand != null && price != null) {
            if (tshortColor != null) {
                sb.append("T-Short ").append(brand).append(", color:").append(tshortColor).append(". ");
            }


            if (capColor != null) {
                sb.append("Cap ").append(brand).append(", color:").append(capColor).append(". ");

            }

            sb.append("Price: ").append(price.getPrice()).append(" " + Constants.CURRENCY);
        }


        return sb.toString();
    }


}
