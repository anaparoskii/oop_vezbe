package vezbe5;

public enum Status {
    ACTIVE(0, true), DELETED(1, false), BOTH(-1, true);

    final int value;
    final boolean activity;

    Status(int value, boolean activity) {
        this.value = value;
        this.activity = activity;
    }
}
