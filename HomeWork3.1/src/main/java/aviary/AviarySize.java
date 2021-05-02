package aviary;

public enum AviarySize {
    SMALL (0),
    MEDIUM (1),
    BIG (2),
    LARGE (3)
    ;
    private final int num;

    AviarySize(int i) {
        this.num = i;
    }

    public int getIntSize() {
        return this.num;
    }
}
