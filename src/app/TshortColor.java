package app;

public enum TshortColor {

    RED,BLUE;

    @Override
    public String toString() {
        return name().toUpperCase();
    }
}
