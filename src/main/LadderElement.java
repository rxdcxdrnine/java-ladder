package main;

public enum LadderElement {
    VERTICAL("|"),
    HORIZONTAL("-----"),
    BLANK("     ");

    private final String str;

    LadderElement(String str) {
        this.str = str;
    }

    public String get() {
        return str;
    }

    public static int getGap() {
        return HORIZONTAL.get().length();
    }
}