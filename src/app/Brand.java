package app;

public enum Brand {

    ACTIVE_SPORTS("\"Active sports\""),
    SMART_CAPS("\"Smart caps\"");

    private final String displayName;

    Brand(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
