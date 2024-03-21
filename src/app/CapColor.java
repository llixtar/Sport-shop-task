package app;

public enum CapColor {

    BLACK,WHITE;

    @Override
    public String toString() {
        return name().toUpperCase();
    }
}
