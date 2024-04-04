package vezbe5;

public enum ProfessorTitle {
    ASSISTANT,
    ASSOCIATE_PROFESSOR,
    FULL_PROFESSOR;

    public String toString() {
        return switch (this) {
            case ASSISTANT -> "Assistant";
            case ASSOCIATE_PROFESSOR -> "Associate Professor";
            case FULL_PROFESSOR -> "Full Professor";
        };
    }
}
