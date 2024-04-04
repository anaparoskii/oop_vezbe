package vezbe5;

public class Grade {
    private Classes classGraded;
    private int grade;

    public Grade() {}
    public Grade(Classes classGraded, int grade) {
        this.classGraded = classGraded;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Classes getClassGraded() {
        return classGraded;
    }

    public void setClassGraded(Classes classGraded) {
        this.classGraded = classGraded;
    }
}
