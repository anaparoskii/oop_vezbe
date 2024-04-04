package vezbe5;

public enum Semester {
    FIRST(1), SECOND(2), THIRD(3),
    FOURTH(4), FIFTH(5), SIXTH(6),
    SEVENTH(7), EIGHTH(8);

    final int semesterNumber;
    Semester(int i) {
        this.semesterNumber = i;
    }

    public String toString() {
        return switch (this) {
            case FIRST -> "1st";
            case SECOND -> "2nd";
            case THIRD -> "3rd";
            case FOURTH -> "4th";
            case FIFTH -> "5th";
            case SIXTH -> "6th";
            case SEVENTH -> "7th";
            case EIGHTH -> "8th";
        };
    }
}
